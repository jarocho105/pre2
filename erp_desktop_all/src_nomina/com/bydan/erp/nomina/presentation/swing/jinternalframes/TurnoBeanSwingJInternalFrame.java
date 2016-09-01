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


import java.sql.Time;


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

import com.bydan.erp.nomina.util.TurnoConstantesFunciones;
import com.bydan.erp.nomina.util.TurnoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TurnoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TurnoBean;
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

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TurnoBeanSwingJInternalFrame extends TurnoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TurnoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Turno> turnoValidator = new ClassValidator<Turno>(Turno.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Turno turno;	
	public Turno turnoAux;
	public Turno turnoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Turno turnoTotales;
	public Long idTurnoActual;
	public Long iIdNuevoTurno=0L;
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
	
	public Boolean isPermisoTodoTurno;
	public Boolean isPermisoNuevoTurno;
	public Boolean isPermisoActualizarTurno;
	public Boolean isPermisoActualizarOriginalTurno;
	public Boolean isPermisoEliminarTurno;
	public Boolean isPermisoGuardarCambiosTurno;
	public Boolean isPermisoConsultaTurno;
	public Boolean isPermisoBusquedaTurno;
	public Boolean isPermisoReporteTurno;
	public Boolean isPermisoPaginacionMedioTurno;
	public Boolean isPermisoPaginacionAltoTurno;
	public Boolean isPermisoPaginacionTodoTurno;
	public Boolean isPermisoCopiarTurno;
	public Boolean isPermisoVerFormTurno;
	public Boolean isPermisoDuplicarTurno;
	public Boolean isPermisoOrdenTurno;
	
	
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
	
	public TurnoParameterReturnGeneral turnoReturnGeneral;
	public TurnoParameterReturnGeneral turnoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTurno=false;
	public Boolean esParaAccionDesdeFormularioTurno=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TurnoSessionBeanAdditional turnoSessionBeanAdditional=null;
	
	public TurnoSessionBeanAdditional getTurnoSessionBeanAdditional() {
		return this.turnoSessionBeanAdditional;
	}
	
	public void setTurnoSessionBeanAdditional(TurnoSessionBeanAdditional turnoSessionBeanAdditional) {
		try {
			this.turnoSessionBeanAdditional=turnoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TurnoBeanSwingJInternalFrameAdditional turnoBeanSwingJInternalFrameAdditional=null;
	//public class TurnoBeanSwingJInternalFrame
	
	public TurnoBeanSwingJInternalFrameAdditional getTurnoBeanSwingJInternalFrameAdditional() {
		return this.turnoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTurnoBeanSwingJInternalFrameAdditional(TurnoBeanSwingJInternalFrameAdditional turnoBeanSwingJInternalFrameAdditional) {
		try {
			this.turnoBeanSwingJInternalFrameAdditional=turnoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TurnoLogic turnoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Turno turnoBean;
	public TurnoConstantesFunciones turnoConstantesFunciones;
	//public TurnoParameterReturnGeneral turnoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<Turno> turnos;	
	//public List<Turno> turnosEliminados;
	//public List<Turno> turnosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTurno=false;
	public Boolean isVisibilidadCeldaDuplicarTurno=true;
	public Boolean isVisibilidadCeldaCopiarTurno=true;
	public Boolean isVisibilidadCeldaVerFormTurno=true;
	public Boolean isVisibilidadCeldaOrdenTurno=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTurno=false;
	public Boolean isVisibilidadCeldaModificarTurno=false;
	public Boolean isVisibilidadCeldaActualizarTurno=false;
	public Boolean isVisibilidadCeldaEliminarTurno=false;
	public Boolean isVisibilidadCeldaCancelarTurno=false;
	public Boolean isVisibilidadCeldaGuardarTurno=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTurno=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTurno() {
		return this.iIdNuevoTurno;
	}

	public void setiIdNuevoTurno(Long iIdNuevoTurno) {
		this.iIdNuevoTurno = iIdNuevoTurno;
	}
	
	public Long getidTurnoActual() {
		return this.idTurnoActual;
	}

	public void setidTurnoActual(Long idTurnoActual) {
		this.idTurnoActual = idTurnoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Turno getturno() {
		return this.turno;
	}

	public void setturno(Turno turno) {
		this.turno = turno;
	}
	
	public Turno getturnoAux() {
		return this.turnoAux;
	}

	public void setturnoAux(Turno turnoAux) {
		this.turnoAux = turnoAux;
	}				
	
	public Turno getturnoAnterior() {
		return this.turnoAnterior;
	}

	public void setturnoAnterior(Turno turnoAnterior) {
		this.turnoAnterior = turnoAnterior;
	}	
	
	public Turno getturnoTotales() {
		return this.turnoTotales;
	}

	public void setturnoTotales(Turno turnoTotales) {
		this.turnoTotales = turnoTotales;
	}	
	
	public Turno getturnoBean() {
		return this.turnoBean;
	}

	public void setturnoBean(Turno turnoBean) {
		this.turnoBean = turnoBean;
	}	
	
	public TurnoParameterReturnGeneral getturnoReturnGeneral() {
		return this.turnoReturnGeneral;
	}

	public void setturnoReturnGeneral(TurnoParameterReturnGeneral turnoReturnGeneral) {
		this.turnoReturnGeneral = turnoReturnGeneral;
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
	
	
	public TurnoLogic getTurnoLogic()	{		
		return turnoLogic;
	}

	public void setTurnoLogic(TurnoLogic turnoLogic) {
		this.turnoLogic = turnoLogic;
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
	
	public Boolean getIsEsNuevoTurno() {
		return isEsNuevoTurno;
	}

	public void setIsEsNuevoTurno(Boolean isEsNuevoTurno) {
		this.isEsNuevoTurno = isEsNuevoTurno;
	}

	public Boolean getEsParaAccionDesdeFormularioTurno() {
		return esParaAccionDesdeFormularioTurno;
	}
	
	public void setEsParaAccionDesdeFormularioTurno(Boolean esParaAccionDesdeFormularioTurno) {
		this.esParaAccionDesdeFormularioTurno = esParaAccionDesdeFormularioTurno;
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

			if(this.turnoSessionBean==null) {
				this.turnoSessionBean=new TurnoSessionBean();
			}

			if(!this.turnoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(turnoSessionBean.getlidEmpresaActual());
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

					if(this.turno!=null) {
						this.turno.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTurno!=null) {
						this.jInternalFrameDetalleFormTurno.jComboBoxid_empresaTurno.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTurno.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTurno!=null) {
						if(this.jInternalFrameDetalleFormTurno.jComboBoxid_empresaTurno.getItemCount()>0) {
							this.jInternalFrameDetalleFormTurno.jComboBoxid_empresaTurno.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTurnoGenerico)throws Exception
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
				jComboBoxid_empresaTurnoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTurnoGenerico!=null && jComboBoxid_empresaTurnoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTurnoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Turno turno,JComboBox jComboBoxid_empresaTurnoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTurnoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTurno.jComboBoxid_empresaTurno.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTurnoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				turno.setid_empresa(empresaAux.getId());
				turno.setempresa_descripcion(TurnoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				turno.setEmpresa(empresaAux);			}
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

					if(!TurnoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTurno!=null) { 
							this.jInternalFrameDetalleFormTurno.jComboBoxid_empresaTurno.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTurno.jComboBoxid_empresaTurno.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTurno!=null) { 
					}

					if(!TurnoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTurno!=null) {
							this.jInternalFrameDetalleFormTurno.jComboBoxid_empresaTurno.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTurno!=null) {
							this.jInternalFrameDetalleFormTurno.jComboBoxid_empresaTurno.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTurno() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TurnoConstantesFunciones.refrescarForeignKeysDescripcionesTurno(this.turnoLogic.getTurnos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TurnoConstantesFunciones.refrescarForeignKeysDescripcionesTurno(this.turnos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//turnoLogic.setTurnos(this.turnos);
			turnoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TurnoParameterReturnGeneral getTurnoParameterGeneral() {
		return this.turnoParameterGeneral;
	}
	
	public void setTurnoParameterGeneral(TurnoParameterReturnGeneral turnoParameterGeneral) {
		this.turnoParameterGeneral = turnoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTurno() {
		return isPermisoTodoTurno;
	}

	public void setIsPermisoTodoTurno(Boolean isPermisoTodoTurno) {
		this.isPermisoTodoTurno = isPermisoTodoTurno;
	}

	public Boolean getIsPermisoNuevoTurno() {
		return isPermisoNuevoTurno;
	}

	public void setIsPermisoNuevoTurno(Boolean isPermisoNuevoTurno) {
		this.isPermisoNuevoTurno = isPermisoNuevoTurno;
	}

	public Boolean getIsPermisoActualizarTurno() {
		return isPermisoActualizarTurno;
	}

	public void setIsPermisoActualizarTurno(Boolean isPermisoActualizarTurno) {
		this.isPermisoActualizarTurno = isPermisoActualizarTurno;
	}

	public Boolean getIsPermisoEliminarTurno() {
		return isPermisoEliminarTurno;
	}

	public void setIsPermisoEliminarTurno(Boolean isPermisoEliminarTurno) {
		this.isPermisoEliminarTurno = isPermisoEliminarTurno;
	}

	public Boolean getIsPermisoGuardarCambiosTurno() {
		return isPermisoGuardarCambiosTurno;
	}

	public void setIsPermisoGuardarCambiosTurno(Boolean isPermisoGuardarCambiosTurno) {
		this.isPermisoGuardarCambiosTurno = isPermisoGuardarCambiosTurno;
	}
	
	public Boolean getIsPermisoConsultaTurno() {
		return isPermisoConsultaTurno;
	}

	public void setIsPermisoConsultaTurno(Boolean isPermisoConsultaTurno) {
		this.isPermisoConsultaTurno = isPermisoConsultaTurno;
	}

	public Boolean getIsPermisoBusquedaTurno() {
		return isPermisoBusquedaTurno;
	}

	public void setIsPermisoBusquedaTurno(Boolean isPermisoBusquedaTurno) {
		this.isPermisoBusquedaTurno = isPermisoBusquedaTurno;
	}

	public Boolean getIsPermisoReporteTurno() {
		return isPermisoReporteTurno;
	}

	public void setIsPermisoReporteTurno(Boolean isPermisoReporteTurno) {
		this.isPermisoReporteTurno = isPermisoReporteTurno;
	}
	
	public Boolean getIsPermisoPaginacionMedioTurno() {
		return isPermisoPaginacionMedioTurno;
	}

	public void setIsPermisoPaginacionMedioTurno(Boolean isPermisoPaginacionMedioTurno) {
		this.isPermisoPaginacionMedioTurno = isPermisoPaginacionMedioTurno;
	}
	
	public Boolean getIsPermisoPaginacionTodoTurno() {
		return isPermisoPaginacionTodoTurno;
	}

	public void setIsPermisoPaginacionTodoTurno(Boolean isPermisoPaginacionTodoTurno) {
		this.isPermisoPaginacionTodoTurno = isPermisoPaginacionTodoTurno;
	}
	
	public Boolean getIsPermisoPaginacionAltoTurno() {
		return isPermisoPaginacionAltoTurno;
	}

	public void setIsPermisoPaginacionAltoTurno(Boolean isPermisoPaginacionAltoTurno) {
		this.isPermisoPaginacionAltoTurno = isPermisoPaginacionAltoTurno;
	}
	
	public Boolean getIsPermisoCopiarTurno() {
		return isPermisoCopiarTurno;
	}

	public void setIsPermisoCopiarTurno(Boolean isPermisoCopiarTurno) {
		this.isPermisoCopiarTurno = isPermisoCopiarTurno;
	}
	
	public Boolean getIsPermisoVerFormTurno() {
		return isPermisoVerFormTurno;
	}

	public void setIsPermisoVerFormTurno(Boolean isPermisoVerFormTurno) {
		this.isPermisoVerFormTurno = isPermisoVerFormTurno;
	}
	
	public Boolean getIsPermisoDuplicarTurno() {
		return isPermisoDuplicarTurno;
	}

	public void setIsPermisoDuplicarTurno(Boolean isPermisoDuplicarTurno) {
		this.isPermisoDuplicarTurno = isPermisoDuplicarTurno;
	}
	
	public Boolean getIsPermisoOrdenTurno() {
		return isPermisoOrdenTurno;
	}

	public void setIsPermisoOrdenTurno(Boolean isPermisoOrdenTurno) {
		this.isPermisoOrdenTurno = isPermisoOrdenTurno;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTurno() {
		return isVisibilidadCeldaNuevoTurno;
	}

	public void setIsVisibilidadCeldaNuevoTurno(Boolean isVisibilidadCeldaNuevoTurno) {
		this.isVisibilidadCeldaNuevoTurno = isVisibilidadCeldaNuevoTurno;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTurno() {
		return isVisibilidadCeldaDuplicarTurno;
	}

	public void setIsVisibilidadCeldaDuplicarTurno(Boolean isVisibilidadCeldaDuplicarTurno) {
		this.isVisibilidadCeldaDuplicarTurno = isVisibilidadCeldaDuplicarTurno;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTurno() {
		return isVisibilidadCeldaCopiarTurno;
	}

	public void setIsVisibilidadCeldaCopiarTurno(Boolean isVisibilidadCeldaCopiarTurno) {
		this.isVisibilidadCeldaCopiarTurno = isVisibilidadCeldaCopiarTurno;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTurno() {
		return isVisibilidadCeldaVerFormTurno;
	}

	public void setIsVisibilidadCeldaVerFormTurno(Boolean isVisibilidadCeldaVerFormTurno) {
		this.isVisibilidadCeldaVerFormTurno = isVisibilidadCeldaVerFormTurno;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTurno() {
		return isVisibilidadCeldaOrdenTurno;
	}

	public void setIsVisibilidadCeldaOrdenTurno(Boolean isVisibilidadCeldaOrdenTurno) {
		this.isVisibilidadCeldaOrdenTurno = isVisibilidadCeldaOrdenTurno;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTurno() {
		return isVisibilidadCeldaNuevoRelacionesTurno;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTurno(Boolean isVisibilidadCeldaNuevoRelacionesTurno) {
		this.isVisibilidadCeldaNuevoRelacionesTurno = isVisibilidadCeldaNuevoRelacionesTurno;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTurno() {
		return isVisibilidadCeldaModificarTurno;
	}

	public void setIsVisibilidadCeldaModificarTurno(Boolean isVisibilidadCeldaModificarTurno) {
		this.isVisibilidadCeldaModificarTurno = isVisibilidadCeldaModificarTurno;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTurno() {
		return isVisibilidadCeldaActualizarTurno;
	}

	public void setIsVisibilidadCeldaActualizarTurno(Boolean isVisibilidadCeldaActualizarTurno) {
		this.isVisibilidadCeldaActualizarTurno = isVisibilidadCeldaActualizarTurno;
	}

	public Boolean getIsVisibilidadCeldaEliminarTurno() {
		return isVisibilidadCeldaEliminarTurno;
	}

	public void setIsVisibilidadCeldaEliminarTurno(Boolean isVisibilidadCeldaEliminarTurno) {
		this.isVisibilidadCeldaEliminarTurno = isVisibilidadCeldaEliminarTurno;
	}

	public Boolean getIsVisibilidadCeldaCancelarTurno() {
		return isVisibilidadCeldaCancelarTurno;
	}

	public void setIsVisibilidadCeldaCancelarTurno(Boolean isVisibilidadCeldaCancelarTurno) {
		this.isVisibilidadCeldaCancelarTurno = isVisibilidadCeldaCancelarTurno;
	}

	public Boolean getIsVisibilidadCeldaGuardarTurno() {
		return isVisibilidadCeldaGuardarTurno;
	}

	public void setIsVisibilidadCeldaGuardarTurno(Boolean isVisibilidadCeldaGuardarTurno) {
		this.isVisibilidadCeldaGuardarTurno = isVisibilidadCeldaGuardarTurno;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTurno() {
		return isVisibilidadCeldaGuardarCambiosTurno;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTurno(Boolean isVisibilidadCeldaGuardarCambiosTurno) {
		this.isVisibilidadCeldaGuardarCambiosTurno = isVisibilidadCeldaGuardarCambiosTurno;
	}
		
	public TurnoSessionBean getturnoSessionBean() {
		return this.turnoSessionBean;
	}
	
	public void setturnoSessionBean(TurnoSessionBean turnoSessionBean) {
		this.turnoSessionBean=turnoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTurno(Turno turno)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(turno,null);
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
	
	public void bugActualizarReferenciaActual(Turno turno,Turno turnoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTurno(turno);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		turnoAux.setId(turno.getId());
		turnoAux.setVersionRow(turno.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTurno();
		
			int intSelectedRow = this.jTableDatosTurno.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TurnoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTurno(this.turno,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = turnoValidator.getInvalidValues(this.turno);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			turnoLogic.setDatosCliente(datosCliente);
			turnoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				turnoAux=new  Turno();
				
				turnoAux.setIsNew(true);
				turnoAux.setIsChanged(true);
				
				turnoAux.setTurnoOriginal(this.turno);
				
				turnoAux.setId(this.turno.getId());	
				turnoAux.setVersionRow(this.turno.getVersionRow());	
				turnoAux.setid_empresa(this.turno.getid_empresa());	
				turnoAux.sethora_entrada(this.turno.gethora_entrada());	
				turnoAux.sethora_salida(this.turno.gethora_salida());	
				turnoAux.sethora_ingreso_receso(this.turno.gethora_ingreso_receso());	
				turnoAux.sethora_salida_receso(this.turno.gethora_salida_receso());	
				turnoAux.sethora_durante_receso(this.turno.gethora_durante_receso());	
				turnoAux.sethora_ingreso_almuerzo(this.turno.gethora_ingreso_almuerzo());	
				turnoAux.sethora_salida_almuerzo(this.turno.gethora_salida_almuerzo());	
				turnoAux.sethora_durante_almuerzo(this.turno.gethora_durante_almuerzo());	
				turnoAux.sethora_ingreso25(this.turno.gethora_ingreso25());	
				turnoAux.sethora_salida25(this.turno.gethora_salida25());	
				turnoAux.sethora_ingreso50(this.turno.gethora_ingreso50());	
				turnoAux.sethora_salida50(this.turno.gethora_salida50());	
				turnoAux.sethora_ingreso100(this.turno.gethora_ingreso100());	
				turnoAux.sethora_salida100(this.turno.gethora_salida100());	
				turnoAux.sethora_ingreso200(this.turno.gethora_ingreso200());	
				turnoAux.sethora_salida200(this.turno.gethora_salida200());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.turnoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.turnoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(turnoAux,turnoLogic.getTurnos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(turnoAux,turnos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.turnoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.turnoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						turnoLogic.saveTurnos();//WithConnection
						//turnoLogic.getSetVersionRowTurnos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.turno,turnoAux);
					
					this.refrescarForeignKeysDescripcionesTurno();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.turnoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.turnoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								turnoLogic.saveTurnoRelaciones(turnoAux);//WithConnection
								//turnoLogic.getSetVersionRowTurnos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.turno,turnoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.turnoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.turnoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(turnoAux,turnoLogic.getTurnos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(turnoAux,turnos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.turno,turnoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				turnoAux=new  Turno();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.turnoSessionBean.getEsGuardarRelacionado() 
					|| (this.turnoSessionBean.getEsGuardarRelacionado() && this.turno.getId()>=0)) {
						
					turnoAux.setIsNew(false);
				}
				
				turnoAux.setIsDeleted(false);
			
				turnoAux.setId(this.turno.getId());	
				turnoAux.setVersionRow(this.turno.getVersionRow());	
				turnoAux.setid_empresa(this.turno.getid_empresa());	
				turnoAux.sethora_entrada(this.turno.gethora_entrada());	
				turnoAux.sethora_salida(this.turno.gethora_salida());	
				turnoAux.sethora_ingreso_receso(this.turno.gethora_ingreso_receso());	
				turnoAux.sethora_salida_receso(this.turno.gethora_salida_receso());	
				turnoAux.sethora_durante_receso(this.turno.gethora_durante_receso());	
				turnoAux.sethora_ingreso_almuerzo(this.turno.gethora_ingreso_almuerzo());	
				turnoAux.sethora_salida_almuerzo(this.turno.gethora_salida_almuerzo());	
				turnoAux.sethora_durante_almuerzo(this.turno.gethora_durante_almuerzo());	
				turnoAux.sethora_ingreso25(this.turno.gethora_ingreso25());	
				turnoAux.sethora_salida25(this.turno.gethora_salida25());	
				turnoAux.sethora_ingreso50(this.turno.gethora_ingreso50());	
				turnoAux.sethora_salida50(this.turno.gethora_salida50());	
				turnoAux.sethora_ingreso100(this.turno.gethora_ingreso100());	
				turnoAux.sethora_salida100(this.turno.gethora_salida100());	
				turnoAux.sethora_ingreso200(this.turno.gethora_ingreso200());	
				turnoAux.sethora_salida200(this.turno.gethora_salida200());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(turnoAux,turnoLogic.getTurnos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(turnoAux,turnos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.turnoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.turnoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						turnoLogic.saveTurnos();//WithConnection
						//turnoLogic.getSetVersionRowTurnos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.turno,turnoAux);
					
					this.refrescarForeignKeysDescripcionesTurno();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.turnoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.turnoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								turnoLogic.saveTurnoRelaciones(turnoAux);//WithConnection
								//turnoLogic.getSetVersionRowTurnos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.turno,turnoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.turnoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.turnoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(turnoAux,turnoLogic.getTurnos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(turnoAux,turnos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.turno,turnoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				turnoAux=new  Turno();
				
				turnoAux.setIsNew(false);
				turnoAux.setIsChanged(false);
				
				turnoAux.setIsDeleted(true);
				
				turnoAux.setId(this.turno.getId());	
				turnoAux.setVersionRow(this.turno.getVersionRow());	
				turnoAux.setid_empresa(this.turno.getid_empresa());	
				turnoAux.sethora_entrada(this.turno.gethora_entrada());	
				turnoAux.sethora_salida(this.turno.gethora_salida());	
				turnoAux.sethora_ingreso_receso(this.turno.gethora_ingreso_receso());	
				turnoAux.sethora_salida_receso(this.turno.gethora_salida_receso());	
				turnoAux.sethora_durante_receso(this.turno.gethora_durante_receso());	
				turnoAux.sethora_ingreso_almuerzo(this.turno.gethora_ingreso_almuerzo());	
				turnoAux.sethora_salida_almuerzo(this.turno.gethora_salida_almuerzo());	
				turnoAux.sethora_durante_almuerzo(this.turno.gethora_durante_almuerzo());	
				turnoAux.sethora_ingreso25(this.turno.gethora_ingreso25());	
				turnoAux.sethora_salida25(this.turno.gethora_salida25());	
				turnoAux.sethora_ingreso50(this.turno.gethora_ingreso50());	
				turnoAux.sethora_salida50(this.turno.gethora_salida50());	
				turnoAux.sethora_ingreso100(this.turno.gethora_ingreso100());	
				turnoAux.sethora_salida100(this.turno.gethora_salida100());	
				turnoAux.sethora_ingreso200(this.turno.gethora_ingreso200());	
				turnoAux.sethora_salida200(this.turno.gethora_salida200());	
				
				if(this.turnoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.turnoAux.getId()>=0) {	
						this.turnosEliminados.add(turnoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(turnoAux,turnoLogic.getTurnos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(turnoAux,turnos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.turnoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.turnoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						turnoLogic.saveTurnos();//WithConnection
						//turnoLogic.getSetVersionRowTurnos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.turnoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.turnoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								turnoLogic.saveTurnoRelaciones(turnoAux);//WithConnection
								//turnoLogic.getSetVersionRowTurnos();//WithConnection
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
							if(this.turnoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.turnoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(turnoAux,turnoLogic.getTurnos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(turnoAux,turnos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.getTurnos().addAll(this.turnosEliminados);
					
					turnoLogic.saveTurnos();//WithConnection
					//turnoLogic.getSetVersionRowTurnos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTurno();
				
				this.turnosEliminados= new ArrayList<Turno>();		
			}
			
			if(this.turnoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.turnoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Turno GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Turno",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.turno=turnoAux;
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
      		//this.finishProcessTurno();
      	}
		
	}	
	
	public void actualizarRelaciones(Turno turnoLocal) throws Exception {
		
		if(this.turnoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Turno turnoLocal) throws Exception {	
		if(this.turnoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				turnoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTurnoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTurno.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = turnoValidator.getInvalidValues(this.turno);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Turno turno,List<Turno> turnos) throws Exception {
		try	{		
			TurnoConstantesFunciones.actualizarLista(turno,turnos,this.turnoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Turno turno,List<Turno> turnos) throws Exception {
		try	{			
			TurnoConstantesFunciones.actualizarSelectedLista(turno,turnos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Turno> turnosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				turnosLocal=this.turnoLogic.getTurnos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				turnosLocal=this.turnos;
			}
			//ARCHITECTURE
		
			for(Turno turnoLocal:turnosLocal) {
				if(this.permiteMantenimiento(turnoLocal) && turnoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TurnoConstantesFunciones.getTurnoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TurnoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelid_empresaTurno,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TurnoConstantesFunciones.HORAENTRADA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_entradaTurno,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TurnoConstantesFunciones.HORASALIDA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_salidaTurno,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TurnoConstantesFunciones.HORAINGRESORECESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_ingreso_recesoTurno,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TurnoConstantesFunciones.HORASALIDARECESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_salida_recesoTurno,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TurnoConstantesFunciones.HORADURANTERECESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_durante_recesoTurno,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TurnoConstantesFunciones.HORAINGRESOALMUERZO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_ingreso_almuerzoTurno,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TurnoConstantesFunciones.HORASALIDAALMUERZO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_salida_almuerzoTurno,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TurnoConstantesFunciones.HORADURANTEALMUERZO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_durante_almuerzoTurno,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TurnoConstantesFunciones.HORAINGRESO25)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_ingreso25Turno,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TurnoConstantesFunciones.HORASALIDA25)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_salida25Turno,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TurnoConstantesFunciones.HORAINGRESO50)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_ingreso50Turno,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TurnoConstantesFunciones.HORASALIDA50)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_salida50Turno,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TurnoConstantesFunciones.HORAINGRESO100)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_ingreso100Turno,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TurnoConstantesFunciones.HORASALIDA100)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_salida100Turno,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TurnoConstantesFunciones.HORAINGRESO200)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_ingreso200Turno,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TurnoConstantesFunciones.HORASALIDA200)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_salida200Turno,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTurno!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTurno.jLabelid_empresaTurno,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTurno.jLabelhora_entradaTurno,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTurno.jLabelhora_salidaTurno,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTurno.jLabelhora_ingreso_recesoTurno,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTurno.jLabelhora_salida_recesoTurno,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTurno.jLabelhora_durante_recesoTurno,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTurno.jLabelhora_ingreso_almuerzoTurno,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTurno.jLabelhora_salida_almuerzoTurno,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTurno.jLabelhora_durante_almuerzoTurno,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTurno.jLabelhora_ingreso25Turno,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTurno.jLabelhora_salida25Turno,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTurno.jLabelhora_ingreso50Turno,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTurno.jLabelhora_salida50Turno,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTurno.jLabelhora_ingreso100Turno,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTurno.jLabelhora_salida100Turno,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTurno.jLabelhora_ingreso200Turno,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTurno.jLabelhora_salida200Turno,"");
		
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
		this.iIdNuevoTurno--;	
		
		
		this.turnoAux=new Turno();
		
		this.turnoAux.setId(this.iIdNuevoTurno);
		this.turnoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.turnoLogic.getTurnos().add(this.turnoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.turnos.add(this.turnoAux);
		}
		//ARCHITECTURE
		
		this.turno=this.turnoAux;
		
		if(TurnoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTurno(this.turno);
			this.setVariablesObjetoActualToFormularioForeignKeyTurno(this.turno);
		}
				
		//this.setDefaultControlesTurno();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTurno();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTurno();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTurno();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTurno(this.turnoBean,this.turno,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TurnoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.turnoSessionBean.getConGuardarRelaciones()) {
			classes=TurnoConstantesFunciones.getClassesRelationshipsOfTurno(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.turnoReturnGeneral=turnoLogic.procesarEventosTurnosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.turnoLogic.getTurnos(),this.turno,this.turnoParameterGeneral,this.isEsNuevoTurno,classes);//this.turnoLogic.getTurno()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTurno(this.turnoReturnGeneral,this.turnoBean,false);
		
		if(this.turnoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTurno(this.turnoReturnGeneral.getTurno());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTurno(this.turnoReturnGeneral.getTurno());
		}
		
		if(this.turnoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTurno(this.turnoReturnGeneral.getTurno(),classes);//this.turnoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTurno(this.turno,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTurno();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTurno();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TurnoBeanSwingJInternalFrameAdditional.RecargarFormTurno(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTurno(false);
						
			if(turnoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TurnoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTurno();
			}
			
			this.actualizarVisualTableDatosTurno();
			
			this.jTableDatosTurno.setRowSelectionInterval(this.getIndiceNuevoTurno(), this.getIndiceNuevoTurno());
			
			this.seleccionarFilaTablaTurnoActual();
						
			this.actualizarEstadoCeldasBotonesTurno("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTurno(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_entradaTurno.setEnabled(isHabilitar && this.turnoConstantesFunciones.activarhora_entradaTurno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_salidaTurno.setEnabled(isHabilitar && this.turnoConstantesFunciones.activarhora_salidaTurno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso_recesoTurno.setEnabled(isHabilitar && this.turnoConstantesFunciones.activarhora_ingreso_recesoTurno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida_recesoTurno.setEnabled(isHabilitar && this.turnoConstantesFunciones.activarhora_salida_recesoTurno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_durante_recesoTurno.setEnabled(isHabilitar && this.turnoConstantesFunciones.activarhora_durante_recesoTurno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso_almuerzoTurno.setEnabled(isHabilitar && this.turnoConstantesFunciones.activarhora_ingreso_almuerzoTurno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida_almuerzoTurno.setEnabled(isHabilitar && this.turnoConstantesFunciones.activarhora_salida_almuerzoTurno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_durante_almuerzoTurno.setEnabled(isHabilitar && this.turnoConstantesFunciones.activarhora_durante_almuerzoTurno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso25Turno.setEnabled(isHabilitar && this.turnoConstantesFunciones.activarhora_ingreso25Turno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida25Turno.setEnabled(isHabilitar && this.turnoConstantesFunciones.activarhora_salida25Turno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso50Turno.setEnabled(isHabilitar && this.turnoConstantesFunciones.activarhora_ingreso50Turno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida50Turno.setEnabled(isHabilitar && this.turnoConstantesFunciones.activarhora_salida50Turno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso100Turno.setEnabled(isHabilitar && this.turnoConstantesFunciones.activarhora_ingreso100Turno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida100Turno.setEnabled(isHabilitar && this.turnoConstantesFunciones.activarhora_salida100Turno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso200Turno.setEnabled(isHabilitar && this.turnoConstantesFunciones.activarhora_ingreso200Turno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida200Turno.setEnabled(isHabilitar && this.turnoConstantesFunciones.activarhora_salida200Turno);	
		//
		this.jInternalFrameDetalleFormTurno.jComboBoxid_empresaTurno.setEnabled(isHabilitar && this.turnoConstantesFunciones.activarid_empresaTurno);
	};
	
	public void setDefaultControlesTurno() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTurno(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.turnoSessionBean.setConGuardarRelaciones(true);			
			this.turnoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTurno.jTabbedPaneRelacionesTurno.setVisible(true);
			
					
		} else {
			//this.turnoSessionBean.setConGuardarRelaciones(false);			
			this.turnoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTurno.jTabbedPaneRelacionesTurno.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTurno() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Turno turnoAux:this.turnoLogic.getTurnos()) {
				if(turnoAux.getId().equals(this.iIdNuevoTurno)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Turno turnoAux:this.turnos) {
				if(turnoAux.getId().equals(this.iIdNuevoTurno)) {
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
	
	public int getIndiceActualTurno(Turno turno,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Turno turnoAux:this.turnoLogic.getTurnos()) {
				if(turnoAux.getId().equals(turno.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Turno turnoAux:this.turnos) {
				if(turnoAux.getId().equals(turno.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTurno(Turno turnoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Turno turnoAux:this.turnoLogic.getTurnos()) {
				if(turnoAux.getTurnoOriginal().getId().equals(turnoOriginal.getId())) {
					existe=true;
					turnoOriginal.setId(turnoAux.getId());
					turnoOriginal.setVersionRow(turnoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Turno turnoAux:this.turnos) {
				if(turnoAux.getTurnoOriginal().getId().equals(turnoOriginal.getId())) {
					existe=true;
					turnoOriginal.setId(turnoAux.getId());
					turnoOriginal.setVersionRow(turnoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTurno(Boolean esParaCancelar) throws Exception {
		turnosAux=new ArrayList<Turno>();
		turnoAux=new Turno();
		
		if(!this.turnoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Turno turnoAux:this.turnoLogic.getTurnos()) {
					if(turnoAux.getId()<0) {
						turnosAux.add(turnoAux);
					}		
				}
				this.iIdNuevoTurno=0L;
				this.turnoLogic.getTurnos().removeAll(turnosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Turno turnoAux:this.turnos) {
					if(turnoAux.getId()<0) {
						turnosAux.add(turnoAux);
					}		
				}
				this.iIdNuevoTurno=0L;
				this.turnos.removeAll(turnosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTurno 
					&& this.turnoLogic.getTurnos().size()>0
					) {
					turnoAux=this.turnoLogic.getTurnos().get(this.turnoLogic.getTurnos().size() - 1);
				
					if(turnoAux.getId()<0) {
						this.turnoLogic.getTurnos().remove(turnoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTurno && this.turnos.size()>0) {
					turnoAux=this.turnos.get(this.turnos.size() - 1);
				
					if(turnoAux.getId()<0) {
						this.turnos.remove(turnoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTurno(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(turno.getId()<0) {
				this.turnoLogic.getTurnos().remove(this.turno);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(turno.getId()<0) {
				this.turnos.remove(this.turno);
			}
		}			
	}
	
	public void setEstadosInicialesTurno(List<Turno> turnosAux) throws Exception {
		TurnoConstantesFunciones.setEstadosInicialesTurno(turnosAux);
	}
	
	public void setEstadosInicialesTurno(Turno turnoAux) throws Exception {
		TurnoConstantesFunciones.setEstadosInicialesTurno(turnoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTurnoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTurno("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTurnoActual()) {
				if(!this.isEsNuevoTurno) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTurno("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTurno=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTurnoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Turno ?", "MANTENIMIENTO DE Turno", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTurno("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Turno turno) throws Exception {
		TurnoConstantesFunciones.seleccionarAsignar(this.turno,turno);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTurno=this.isPermisoActualizarOriginalTurno;
			
			
			this.seleccionarAsignar(turno);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TurnoConstantesFunciones.quitarEspaciosTurno(this.turno,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTurno("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.turnoSessionBean.setsFuncionBusquedaRapida(this.turnoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTurno) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTurno(esParaCancelar);				
				this.cancelarNuevoTurno(esParaCancelar);								
			}
			
			this.turno=new Turno();
			
			this.inicializarTurno();
			
			this.actualizarEstadoCeldasBotonesTurno("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTurno() throws Exception {
		try {
			TurnoConstantesFunciones.inicializarTurno(this.turno);
			
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
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.turnoLogic.getTurnos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTurnos(String sAccionBusqueda,List<Turno> turnosParaReportes) throws Exception {
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
					sPathReporteFinal="Turno"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TurnoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TurnoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Turno"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Turnos");		
		parameters.put("busquedapor", TurnoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTurno=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TurnoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TurnoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTurno=new JRBeanArrayDataSource(TurnoJInternalFrame.TraerTurnoBeans(turnosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTurno);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TurnoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TurnoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TurnoBean.TraerTurnoBeans(turnosParaReportes).toArray()));
							
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
				this.generarExcelReporteTurnos(sAccionBusqueda,sTipoArchivoReporte,turnosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTurnos(sAccionBusqueda,sTipoArchivoReporte,turnosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTurnoActionPerformed(null);
					//this.generarExcelReporteTurnos(sAccionBusqueda,sTipoArchivoReporte,turnosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTurnos(sAccionBusqueda,sTipoArchivoReporte,turnosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTurnos(sAccionBusqueda,sTipoArchivoReporte,turnosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTurnos(sAccionBusqueda,sTipoArchivoReporte,turnosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTurnos(String sAccionBusqueda,String sTipoArchivoReporte,List<Turno> turnosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"turno";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Turnos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTurno("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Turno turno : turnosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TurnoConstantesFunciones.generarExcelReporteDataTurno("NORMAL",row,workbook,turno,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.turnoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Turno",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTurno(String sTipo,Row row,Workbook workbook) {
		
		TurnoConstantesFunciones.generarExcelReporteHeaderTurno(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTurnos(String sAccionBusqueda,String sTipoArchivoReporte,List<Turno> turnosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"turno_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Turnos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Turno turno : turnosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TurnoConstantesFunciones.getTurnoDescripcion(turno));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TurnoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TurnoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(turno.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TurnoConstantesFunciones.LABEL_HORAENTRADA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TurnoConstantesFunciones.LABEL_HORAENTRADA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(turno.gethora_entrada());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TurnoConstantesFunciones.LABEL_HORASALIDA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TurnoConstantesFunciones.LABEL_HORASALIDA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(turno.gethora_salida());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TurnoConstantesFunciones.LABEL_HORAINGRESORECESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TurnoConstantesFunciones.LABEL_HORAINGRESORECESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(turno.gethora_ingreso_receso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TurnoConstantesFunciones.LABEL_HORASALIDARECESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TurnoConstantesFunciones.LABEL_HORASALIDARECESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(turno.gethora_salida_receso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TurnoConstantesFunciones.LABEL_HORADURANTERECESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TurnoConstantesFunciones.LABEL_HORADURANTERECESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(turno.gethora_durante_receso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TurnoConstantesFunciones.LABEL_HORAINGRESOALMUERZO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TurnoConstantesFunciones.LABEL_HORAINGRESOALMUERZO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(turno.gethora_ingreso_almuerzo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TurnoConstantesFunciones.LABEL_HORASALIDAALMUERZO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TurnoConstantesFunciones.LABEL_HORASALIDAALMUERZO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(turno.gethora_salida_almuerzo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TurnoConstantesFunciones.LABEL_HORADURANTEALMUERZO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TurnoConstantesFunciones.LABEL_HORADURANTEALMUERZO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(turno.gethora_durante_almuerzo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TurnoConstantesFunciones.LABEL_HORAINGRESO25))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TurnoConstantesFunciones.LABEL_HORAINGRESO25);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(turno.gethora_ingreso25());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TurnoConstantesFunciones.LABEL_HORASALIDA25))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TurnoConstantesFunciones.LABEL_HORASALIDA25);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(turno.gethora_salida25());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TurnoConstantesFunciones.LABEL_HORAINGRESO50))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TurnoConstantesFunciones.LABEL_HORAINGRESO50);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(turno.gethora_ingreso50());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TurnoConstantesFunciones.LABEL_HORASALIDA50))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TurnoConstantesFunciones.LABEL_HORASALIDA50);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(turno.gethora_salida50());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TurnoConstantesFunciones.LABEL_HORAINGRESO100))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TurnoConstantesFunciones.LABEL_HORAINGRESO100);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(turno.gethora_ingreso100());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TurnoConstantesFunciones.LABEL_HORASALIDA100))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TurnoConstantesFunciones.LABEL_HORASALIDA100);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(turno.gethora_salida100());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TurnoConstantesFunciones.LABEL_HORAINGRESO200))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TurnoConstantesFunciones.LABEL_HORAINGRESO200);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(turno.gethora_ingreso200());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TurnoConstantesFunciones.LABEL_HORASALIDA200))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TurnoConstantesFunciones.LABEL_HORASALIDA200);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(turno.gethora_salida200());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.turnoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Turno",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTurnos(String sAccionBusqueda,String sTipoArchivoReporte,List<Turno> turnosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Turno> turnosRespaldo=null;
		
		classes=TurnoConstantesFunciones.getClassesRelationshipsOfTurno(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.turnoLogic.setDatosCliente(this.datosCliente);
		this.turnoLogic.setDatosDeep(this.datosDeep);
		this.turnoLogic.setIsConDeep(true);
		
		turnosRespaldo=this.turnoLogic.getTurnos();
		
		this.turnoLogic.setTurnos(turnosParaReportes);	
		this.turnoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		turnosParaReportes=this.turnoLogic.getTurnos();
		this.turnoLogic.setTurnos(turnosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"turno_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Turnos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTurno("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Turno turno : turnosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTurno("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TurnoConstantesFunciones.generarExcelReporteDataTurno("NORMAL",row,workbook,turno,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TurnoConstantesFunciones.getTurnoDescripcion(turno));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.turnoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Turno",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTurno.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTurno.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTurno.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTurno.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTurno() throws Exception {		
		this.startProcessTurno(true);
	}
	
	public void startProcessTurno(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTurno ,this.jPanelParametrosReportesTurno, this.jScrollPanelDatosTurno,this.jPanelPaginacionTurno, this.jScrollPanelDatosEdicionTurno, this.jPanelAccionesTurno,this.jPanelAccionesFormularioTurno,this.jmenuBarTurno,this.jmenuBarDetalleTurno,this.jTtoolBarTurno,this.jTtoolBarDetalleTurno);		
		
		final JTabbedPane jTabbedPaneBusquedasTurno=this.jTabbedPaneBusquedasTurno; 
		
		final JPanel jPanelParametrosReportesTurno=this.jPanelParametrosReportesTurno;
		//final JScrollPane jScrollPanelDatosTurno=this.jScrollPanelDatosTurno;
		final JTable jTableDatosTurno=this.jTableDatosTurno;		
		final JPanel jPanelPaginacionTurno=this.jPanelPaginacionTurno;
		//final JScrollPane jScrollPanelDatosEdicionTurno=this.jScrollPanelDatosEdicionTurno;
		final JPanel jPanelAccionesTurno=this.jPanelAccionesTurno;
		
		JPanel jPanelCamposAuxiliarTurno=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTurno=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTurno!=null) {
			jPanelCamposAuxiliarTurno=this.jInternalFrameDetalleFormTurno.jPanelCamposTurno;
			jPanelAccionesFormularioAuxiliarTurno=this.jInternalFrameDetalleFormTurno.jPanelAccionesFormularioTurno;
		}
		
		final JPanel jPanelCamposTurno=jPanelCamposAuxiliarTurno;
		final JPanel jPanelAccionesFormularioTurno=jPanelAccionesFormularioAuxiliarTurno;
		
		
		final JMenuBar jmenuBarTurno=this.jmenuBarTurno;
		final JToolBar jTtoolBarTurno=this.jTtoolBarTurno;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTurno=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTurno=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTurno!=null) {
			jmenuBarDetalleAuxiliarTurno=this.jInternalFrameDetalleFormTurno.jmenuBarDetalleTurno;
			jTtoolBarDetalleAuxiliarTurno=this.jInternalFrameDetalleFormTurno.jTtoolBarDetalleTurno;
		}
		
		final JMenuBar jmenuBarDetalleTurno=jmenuBarDetalleAuxiliarTurno;
		final JToolBar jTtoolBarDetalleTurno=jTtoolBarDetalleAuxiliarTurno;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTurno;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTurno;
			processRunnable.jTableDatos=jTableDatosTurno;
			processRunnable.jPanelCampos=jPanelCamposTurno;
			processRunnable.jPanelPaginacion=jPanelPaginacionTurno;
			processRunnable.jPanelAcciones=jPanelAccionesTurno;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTurno;
			
			
			processRunnable.jmenuBar=jmenuBarTurno;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTurno;
			processRunnable.jTtoolBar=jTtoolBarTurno;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTurno;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTurno ,jPanelParametrosReportesTurno,jTableDatosTurno, /*jScrollPanelDatosTurno,*/jPanelCamposTurno,jPanelPaginacionTurno, /*jScrollPanelDatosEdicionTurno,*/ jPanelAccionesTurno,jPanelAccionesFormularioTurno,jmenuBarTurno,jmenuBarDetalleTurno,jTtoolBarTurno,jTtoolBarDetalleTurno);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTurno ,jPanelParametrosReportesTurno, jScrollPanelDatosTurno,jPanelPaginacionTurno, jScrollPanelDatosEdicionTurno, jPanelAccionesTurno,jPanelAccionesFormularioTurno,jmenuBarTurno,jmenuBarDetalleTurno,jTtoolBarTurno,jTtoolBarDetalleTurno);
						
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
	
	public void finishProcessTurno() {// throws Exception 
		this.finishProcessTurno(true);
	}
	
	public void finishProcessTurno(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTurno ,this.jPanelParametrosReportesTurno, this.jScrollPanelDatosTurno,this.jPanelPaginacionTurno, this.jScrollPanelDatosEdicionTurno, this.jPanelAccionesTurno,this.jPanelAccionesFormularioTurno,this.jmenuBarTurno,this.jmenuBarDetalleTurno,this.jTtoolBarTurno,this.jTtoolBarDetalleTurno);		
		
		final JTabbedPane jTabbedPaneBusquedasTurno=this.jTabbedPaneBusquedasTurno; 
		
		final JPanel jPanelParametrosReportesTurno=this.jPanelParametrosReportesTurno;
		//final JScrollPane jScrollPanelDatosTurno=this.jScrollPanelDatosTurno;
		final JTable jTableDatosTurno=this.jTableDatosTurno;		
		final JPanel jPanelPaginacionTurno=this.jPanelPaginacionTurno;
		//final JScrollPane jScrollPanelDatosEdicionTurno=this.jScrollPanelDatosEdicionTurno;
		final JPanel jPanelAccionesTurno=this.jPanelAccionesTurno;
		
		JPanel jPanelCamposAuxiliarTurno=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTurno=new JPanel();
		
		if(this.jInternalFrameDetalleFormTurno!=null) {
			jPanelCamposAuxiliarTurno=this.jInternalFrameDetalleFormTurno.jPanelCamposTurno;
			jPanelAccionesFormularioAuxiliarTurno=this.jInternalFrameDetalleFormTurno.jPanelAccionesFormularioTurno;
		}
		
		final JPanel jPanelCamposTurno=jPanelCamposAuxiliarTurno;
		final JPanel jPanelAccionesFormularioTurno=jPanelAccionesFormularioAuxiliarTurno;
		
		
		final JMenuBar jmenuBarTurno=this.jmenuBarTurno;		
		final JToolBar jTtoolBarTurno=this.jTtoolBarTurno;
				
		JMenuBar jmenuBarDetalleAuxiliarTurno=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTurno=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTurno!=null) {
			jmenuBarDetalleAuxiliarTurno=this.jInternalFrameDetalleFormTurno.jmenuBarDetalleTurno;
			jTtoolBarDetalleAuxiliarTurno=this.jInternalFrameDetalleFormTurno.jTtoolBarDetalleTurno;		
		}
		
		final JMenuBar jmenuBarDetalleTurno=jmenuBarDetalleAuxiliarTurno;
		final JToolBar jTtoolBarDetalleTurno=jTtoolBarDetalleAuxiliarTurno;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTurno;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTurno;
			processRunnable.jTableDatos=jTableDatosTurno;
			processRunnable.jPanelCampos=jPanelCamposTurno;
			processRunnable.jPanelPaginacion=jPanelPaginacionTurno;
			processRunnable.jPanelAcciones=jPanelAccionesTurno;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTurno;
			
			
			processRunnable.jmenuBar=jmenuBarTurno;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTurno;
			processRunnable.jTtoolBar=jTtoolBarTurno;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTurno;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTurno ,jPanelParametrosReportesTurno, jTableDatosTurno,/*jScrollPanelDatosTurno,*/jPanelCamposTurno,jPanelPaginacionTurno, /*jScrollPanelDatosEdicionTurno,*/ jPanelAccionesTurno,jPanelAccionesFormularioTurno,jmenuBarTurno,jmenuBarDetalleTurno,jTtoolBarTurno,jTtoolBarDetalleTurno));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTurno(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTurno(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTurno(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTurno(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTurno,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTurno,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTurno(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTurno,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTurno,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.turnoConstantesFunciones.getsFinalQueryTurno();
		String  finalQueryPaginacionTodos=this.turnoConstantesFunciones.getsFinalQueryTurno();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TurnoConstantesFunciones.getArrayColumnasGlobalesNoTurno(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TurnoConstantesFunciones.getArrayColumnasGlobalesTurno(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TurnoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.turnosEliminados= new ArrayList<Turno>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTurno();
		
				///*TurnoSessionBean*/this.turnoSessionBean=new TurnoSessionBean();
			
			if(this.turnoSessionBean==null) {
				this.turnoSessionBean=new TurnoSessionBean();
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
					this.iNumeroPaginacion=TurnoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TurnoConstantesFunciones.getClassesForeignKeysOfTurno(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/turno."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			turnosAux= new ArrayList<Turno>();
			
				
			turnoLogic.setDatosCliente(this.datosCliente);
			turnoLogic.setDatosDeep(this.datosDeep);
			turnoLogic.setIsConDeep(true);
			
			
			turnoLogic.getTurnoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					turnoLogic.getTodosTurnos(finalQueryGlobal,pagination);
					
					//turnoLogic.getTodosTurnosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(turnoLogic.getTurnos()==null|| turnoLogic.getTurnos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							turnosAux= new ArrayList<Turno>();
							turnosAux.addAll(turnoLogic.getTurnos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							turnosAux= new ArrayList<Turno>();
							turnosAux.addAll(turnos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							turnoLogic.getTodosTurnos(finalQueryGlobal+"",this.pagination);												
							
							//turnoLogic.getTodosTurnosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTurnos("Todos",turnoLogic.getTurnos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							turnoLogic.setTurnos(new ArrayList<Turno>());					
							turnoLogic.getTurnos().addAll(turnosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							turnos=new ArrayList<Turno>();
							turnos.addAll(turnosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTurno=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTurno=this.idActual;
				
				} else if(this.idTurnoActual!=null && this.idTurnoActual!=0L) {
					idTurno=idTurnoActual;
				}
				
					
				this.sDetalleReporte=TurnoConstantesFunciones.getDetalleIndicePorId(idTurno);
				
				this.turnos=new ArrayList<Turno>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					turnoLogic.getEntity(idTurno);
					
					//turnoLogic.getEntityWithConnection(idTurno);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					turnoLogic.setTurnos(new ArrayList<Turno>());
					turnoLogic.getTurnos().add(turnoLogic.getTurno());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.turnos=new ArrayList<Turno>();
					this.turnos.add(turno);
				}
				
				if(turnoLogic.getTurno()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TurnoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					turnoLogic.getTurnosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TurnoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TurnoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=turnoLogic.getTurnos()==null||turnoLogic.getTurnos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=turnos==null|| turnos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						turnosAux=new ArrayList<Turno>();
						turnosAux.addAll(turnoLogic.getTurnos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							turnosAux=new ArrayList<Turno>();
							turnosAux.addAll(turnos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							turnoLogic.getTurnosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TurnoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TurnoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTurnos("FK_IdEmpresa",turnoLogic.getTurnos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTurnos("FK_IdEmpresa",turnos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						turnoLogic.setTurnos(new ArrayList<Turno>());
						turnoLogic.getTurnos().addAll(turnosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							turnos=new ArrayList<Turno>();
							turnos.addAll(turnosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTurno();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTurno();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=turnoLogic.getTurnos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=turnos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=turnoLogic.getTurnos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=turnos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Turno turno) {
		Boolean permite=true;
		
		if(this.turno.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TurnoConstantesFunciones.getOrderByListaTurno();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TurnoConstantesFunciones.getOrderByListaTurno();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Turno turno:turnoLogic.getTurnos()) {
				if(turno.getsType().equals(Constantes2.S_TOTALES)) {
					turnoTotales=turno;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Turno turno:this.turnos) {
				if(turno.getsType().equals(Constantes2.S_TOTALES)) {
					turnoTotales=turno;
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
			this.turnoAux=new Turno();
			this.turnoAux.setsType(Constantes2.S_TOTALES);
			this.turnoAux.setIsNew(false);
			this.turnoAux.setIsChanged(false);
			this.turnoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TurnoConstantesFunciones.TotalizarValoresFilaTurno(this.turnoLogic.getTurnos(),this.turnoAux);
				
				this.turnoLogic.getTurnos().add(this.turnoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TurnoConstantesFunciones.TotalizarValoresFilaTurno(this.turnos,this.turnoAux);
				
				this.turnos.add(this.turnoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		turnoTotales=new Turno();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.turnoLogic.getTurnos().remove(turnoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.turnos.remove(turnoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		turnoTotales=new Turno();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Turno turno:turnoLogic.getTurnos()) {
				if(turno.getsType().equals(Constantes2.S_TOTALES)) {
					turnoTotales=turno;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TurnoConstantesFunciones.TotalizarValoresFilaTurno(this.turnoLogic.getTurnos(),turnoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Turno turno:this.turnos) {
				if(turno.getsType().equals(Constantes2.S_TOTALES)) {
					turnoTotales=turno;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TurnoConstantesFunciones.TotalizarValoresFilaTurno(this.turnos,turnoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTurnosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTurnosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					turnoLogic.getTurnosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTurno() {
		this.isPermisoTodoTurno=false;
		this.isPermisoNuevoTurno=false;
		this.isPermisoActualizarTurno=false;
		this.isPermisoActualizarOriginalTurno=false;
		this.isPermisoEliminarTurno=false;
		this.isPermisoGuardarCambiosTurno=false;
		this.isPermisoConsultaTurno=false;
		this.isPermisoBusquedaTurno=false;
		this.isPermisoReporteTurno=false;		
		this.isPermisoOrdenTurno=false;		
		this.isPermisoPaginacionMedioTurno=false;		
		this.isPermisoPaginacionAltoTurno=false;
		this.isPermisoPaginacionTodoTurno=false;
		this.isPermisoCopiarTurno=false;		
		this.isPermisoVerFormTurno=false;		
		this.isPermisoDuplicarTurno=false;		
		this.isPermisoOrdenTurno=false;		
	}
	
	public void setPermisosUsuarioTurno(Boolean isPermiso) {
		this.isPermisoTodoTurno=isPermiso;
		this.isPermisoNuevoTurno=isPermiso;
		this.isPermisoActualizarTurno=isPermiso;
		this.isPermisoActualizarOriginalTurno=isPermiso;
		this.isPermisoEliminarTurno=isPermiso;
		this.isPermisoGuardarCambiosTurno=isPermiso;
		this.isPermisoConsultaTurno=isPermiso;
		this.isPermisoBusquedaTurno=isPermiso;
		this.isPermisoReporteTurno=isPermiso;
		this.isPermisoOrdenTurno=isPermiso;		
		this.isPermisoPaginacionMedioTurno=isPermiso;		
		this.isPermisoPaginacionAltoTurno=isPermiso;		
		this.isPermisoPaginacionTodoTurno=isPermiso;		
		this.isPermisoCopiarTurno=isPermiso;		
		this.isPermisoVerFormTurno=isPermiso;		
		this.isPermisoDuplicarTurno=isPermiso;
		this.isPermisoOrdenTurno=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTurno(Boolean isPermiso) {
		//this.isPermisoTodoTurno=isPermiso;
		this.isPermisoNuevoTurno=isPermiso;
		this.isPermisoActualizarTurno=isPermiso;
		this.isPermisoActualizarOriginalTurno=isPermiso;
		this.isPermisoEliminarTurno=isPermiso;
		this.isPermisoGuardarCambiosTurno=isPermiso;
		//this.isPermisoConsultaTurno=isPermiso;
		//this.isPermisoBusquedaTurno=isPermiso;
		//this.isPermisoReporteTurno=isPermiso;
		//this.isPermisoOrdenTurno=isPermiso;		
		//this.isPermisoPaginacionMedioTurno=isPermiso;		
		//this.isPermisoPaginacionAltoTurno=isPermiso;		
		//this.isPermisoPaginacionTodoTurno=isPermiso;		
		//this.isPermisoCopiarTurno=isPermiso;		
		//this.isPermisoDuplicarTurno=isPermiso;
		//this.isPermisoOrdenTurno=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTurnoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TurnoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTurno(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTurnoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTurnoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTurnoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTurnoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTurno() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TurnoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.turnoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TurnoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTurno=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTurno=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTurno=this.isPermisoActualizarTurno;
			this.isPermisoEliminarTurno=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTurno=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTurno=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTurno=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTurno=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTurno=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTurno=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTurno=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTurno=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTurno=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTurno=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTurno=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTurno=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTurno=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.turnoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTurno.setToolTipText(this.jTableDatosTurno.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTurno(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTurno(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TurnoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TurnoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTurno() throws Exception {
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
	public void inicializarCombosForeignKeyTurnoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTurnoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TurnoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTurnoListas(false);
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
	
	public void cargarCombosLoteForeignKeyTurnoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TurnoParameterReturnGeneral turnoReturnGeneral=new TurnoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.turnoConstantesFunciones.cargarid_empresaTurno)
					 || (this.esRecargarFks && this.turnoConstantesFunciones.cargarid_empresaTurno)) {

					if(!this.turnoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+turnoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				turnoReturnGeneral=turnoLogic.cargarCombosLoteForeignKeyTurno(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=turnoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTurno()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.turnoSessionBean==null) {
				this.turnoSessionBean=new TurnoSessionBean();
			}

			if(!this.turnoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTurno()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTurno(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTurno()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTurno();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTurno(Turno turno)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTurno(Turno turno,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTurno()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTurno()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTurno()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTurno()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTurno()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTurno()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTurno(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTurno()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTurno.jComboBoxid_empresaTurno!=null && this.jInternalFrameDetalleFormTurno.jComboBoxid_empresaTurno.getItemCount()>0) {
				this.jInternalFrameDetalleFormTurno.jComboBoxid_empresaTurno.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TurnoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TurnoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TurnoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.turnoSessionBean=new TurnoSessionBean(); 
		this.turnoConstantesFunciones=new TurnoConstantesFunciones(); 
		this.turnoBean=new Turno();//(this.turnoConstantesFunciones); 		
		this.turnoReturnGeneral=new TurnoParameterReturnGeneral(); 
		
		this.turnoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.turnoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TurnoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TurnoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TurnoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTurno(true);
			
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
			
			this.turnoConstantesFunciones=new TurnoConstantesFunciones(); 
			this.turnoBean=new Turno();//this.turnoConstantesFunciones); 			
			this.turnoReturnGeneral=new TurnoParameterReturnGeneral(); 
		
			TurnoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Turno Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.turno=new Turno();
			this.turnos = new ArrayList<Turno>();
			this.turnosAux = new ArrayList<Turno>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic=new TurnoLogic();
				this.turnoLogic.getNewConnexionToDeep("");
			}
			
			//this.turnoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.turnoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTurno);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTurno!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTurno);	
					}
					
					if(this.jInternalFrameImportacionTurno!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTurno);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTurno!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTurno);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTurno!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTurno);
				this.jInternalFrameDetalleFormTurno.setVisible(false);
				this.jInternalFrameDetalleFormTurno.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTurno!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTurno);
					this.jInternalFrameReporteDinamicoTurno.setVisible(false);
					this.jInternalFrameReporteDinamicoTurno.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTurno!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTurno);
					this.jInternalFrameImportacionTurno.setVisible(false);
					this.jInternalFrameImportacionTurno.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTurno!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTurno);
					this.jInternalFrameOrderByTurno.setVisible(false);
					this.jInternalFrameOrderByTurno.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTurnoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TurnoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.turnoReturnGeneral=new TurnoParameterReturnGeneral();
			
			this.turnoParameterGeneral=new TurnoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.turnoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.turnoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TurnoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.turnoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TurnoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.turnoSessionBean.getEsGuardarRelacionado(),this.turnoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TurnoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.turnoSessionBean.getEsGuardarRelacionado(),this.turnoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTurno=false;
			this.isVisibilidadCeldaDuplicarTurno=true;
			this.isVisibilidadCeldaCopiarTurno=true;
			this.isVisibilidadCeldaVerFormTurno=true;
			this.isVisibilidadCeldaOrdenTurno=true;
			this.isVisibilidadCeldaNuevoRelacionesTurno=false;
			this.isVisibilidadCeldaModificarTurno=false;
			this.isVisibilidadCeldaActualizarTurno=false;
			this.isVisibilidadCeldaEliminarTurno=false;
			this.isVisibilidadCeldaCancelarTurno=false;
			this.isVisibilidadCeldaGuardarTurno=false;
			this.isVisibilidadCeldaGuardarCambiosTurno=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTurno("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTurno();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTurno(false);
			
			this.setPermisosUsuarioTurno();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.turnoSessionBean.getEsGuardarRelacionado() 
				|| (this.turnoSessionBean.getEsGuardarRelacionado() && this.turnoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTurnoClasesRelacionadas();
			}
			
			if(this.turnoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTurnoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TurnoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTurno();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTurno();
			}
			
			if(!this.isPermisoBusquedaTurno) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTurno.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.turnoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTurno,this.isPermisoPaginacionMedioTurno,this.isPermisoPaginacionTodoTurno);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TurnoConstantesFunciones.getTiposSeleccionarTurno());
				
				this.tiposColumnasSelect=TurnoConstantesFunciones.getTiposSeleccionarTurno(true);
				
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
			//if(!this.turnoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTurno();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTurno(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTurno(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTurno() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				turnoImplementable= (TurnoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TurnoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				turnoImplementableHome= (TurnoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TurnoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.turnos= new ArrayList<Turno>();
			this.turnosEliminados= new ArrayList<Turno>();
						
			this.isEsNuevoTurno=false;
			this.esParaAccionDesdeFormularioTurno=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTurno(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTurno();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.turnoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TurnoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TurnoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTurno("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTurno(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTurno!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTurno();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTurno();
			}
			
			TurnoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTurno.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTurno.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTurno.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTurno(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Turno: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTurno() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTurno")) {
				iIndex=this.jInternalFrameDetalleFormTurno.jTabbedPaneRelacionesTurno.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTurno.jTabbedPaneRelacionesTurno.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTurno.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTurno();	
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
	
	public void cargarCombosForeignKeyTurno(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTurno(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTurno(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTurnoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTurno();
		
		this.cargarCombosFrameForeignKeyTurno();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTurno();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTurno();
		}
	}
	
	
	
	public void jButtonNuevoTurnoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.turnoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTurno==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
			
			
			if(jTableDatosTurno.getRowCount()>=1) {
				jTableDatosTurno.removeRowSelectionInterval(0, jTableDatosTurno.getRowCount()-1);						
			}
			
			this.isEsNuevoTurno=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTurno(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTurno(true);			
			//this.turno=new Turno();
			//this.turno.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTurno(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTurno() ;
			
			if(TurnoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTurno(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.turno);	
			this.actualizarInformacion("INFO_PADRE",false,this.turno);				
			
			TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
			
			if(this.turnoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Turno: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTurnoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Turno> turnosSeleccionados=new ArrayList<Turno>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTurno.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTurno.getSelectedRows().length;			
			}
			
			turnosSeleccionados=this.getTurnosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTurno--;			
				//Turno turnoAux= new Turno();			
				//turnoAux.setId(this.iIdNuevoTurno);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Turno turnoOrigen=new Turno();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Turno turnoOrigen : turnosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTurno.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							turnoOrigen =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							turnoOrigen =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTurno();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.turno.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTurno(turnoOrigen,this.turno,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.turnoLogic.getTurnos().add(this.turnoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.turnos.add(this.turnoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTurno(false);
				
				this.jTableDatosTurno.setRowSelectionInterval(this.getIndiceNuevoTurno(), this.getIndiceNuevoTurno());
				
				int iLastRow =  this.jTableDatosTurno.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTurno.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTurno.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTurno(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTurnoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Turno> turnosSeleccionados=new ArrayList<Turno>();									
		
			Turno turnoOrigen=new Turno();
			Turno turnoDestino=new Turno();
				
			turnosSeleccionados=this.getTurnosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTurno.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || turnosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTurno.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						turnoOrigen =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						turnoOrigen =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						turnoDestino =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						turnoDestino =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				turnoOrigen =turnosSeleccionados.get(0);
				turnoDestino =turnosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTurno(turnoOrigen,turnoDestino,true,false);
				
				turnoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(turnoDestino,turnoLogic.getTurnos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(turnoDestino,turnos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTurno(false);
				
				//this.jTableDatosTurno.setRowSelectionInterval(this.getIndiceNuevoTurno(), this.getIndiceNuevoTurno());
				
				int iLastRow =  this.jTableDatosTurno.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTurno.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTurno.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTurno(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTurnoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTurno==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTurno.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTurnoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTurno.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTurno.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTurno.setVisible(!isVisible);
			this.jPanelPaginacionTurno.setVisible(!isVisible);
			this.jPanelAccionesTurno.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTurnoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTurno();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTurnoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTurno();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTurnoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTurno();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTurnoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTurno();
			
			this.abrirFrameOrderByTurno();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTurnoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTurno();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTurno(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTurno);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTurno.isMaximum()) {
					this.jInternalFrameDetalleFormTurno.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTurno.setSize(this.jInternalFrameDetalleFormTurno.iWidthFormulario,this.jInternalFrameDetalleFormTurno.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTurno.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTurno.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTurno.isMaximum()) {
						this.jInternalFrameDetalleFormTurno.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTurno.jContentPaneDetalleTurno.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTurno.jTabbedPaneRelacionesTurno.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTurno.jContentPaneDetalleTurno.getWidth(),TurnoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTurno.jTabbedPaneRelacionesTurno.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTurno.jContentPaneDetalleTurno.getWidth(),TurnoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTurno.jTabbedPaneRelacionesTurno.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTurno.jContentPaneDetalleTurno.getWidth(),TurnoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTurno.setVisible(true);
	        this.jInternalFrameDetalleFormTurno.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTurno() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTurno==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTurno=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTurno,false,this);
				} else {
					this.jInternalFrameOrderByTurno=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTurno,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTurno);
				this.jInternalFrameOrderByTurno.setVisible(false);
				this.jInternalFrameOrderByTurno.setSelected(false);
				
				this.jInternalFrameOrderByTurno.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTurno"));
				
				this.inicializarActualizarBindingTablaOrderByTurno();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTurno() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTurno==null) {
				
				this.jInternalFrameImportacionTurno=new ImportacionJInternalFrame(TurnoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTurno);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTurno);
				this.jInternalFrameImportacionTurno.setVisible(false);
				this.jInternalFrameImportacionTurno.setSelected(false);


				this.jInternalFrameImportacionTurno.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTurno"));
				this.jInternalFrameImportacionTurno.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTurno"));
				this.jInternalFrameImportacionTurno.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTurno"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTurno() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTurno==null) {
				this.jInternalFrameReporteDinamicoTurno=new ReporteDinamicoJInternalFrame(TurnoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTurno);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTurno);
				this.jInternalFrameReporteDinamicoTurno.setVisible(false);
				this.jInternalFrameReporteDinamicoTurno.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTurno.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTurno"));
				this.jInternalFrameReporteDinamicoTurno.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTurno"));
				this.jInternalFrameReporteDinamicoTurno.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTurno"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTurno();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTurno() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTurno);
			
	       	this.jInternalFrameDetalleFormTurno.setVisible(false);
	        this.jInternalFrameDetalleFormTurno.setSelected(false);
			
			//this.jInternalFrameDetalleFormTurno.dispose();
			//this.jInternalFrameDetalleFormTurno=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTurno() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTurno.setVisible(true);
	        this.jInternalFrameReporteDinamicoTurno.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTurno() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTurno.setVisible(true);
	        this.jInternalFrameImportacionTurno.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTurno() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTurno.setVisible(true);
	        this.jInternalFrameOrderByTurno.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTurno() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTurno.setVisible(false);
	        this.jInternalFrameOrderByTurno.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTurno() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTurno.setVisible(false);
	        this.jInternalFrameReporteDinamicoTurno.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTurno() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTurno.setVisible(false);
	        this.jInternalFrameImportacionTurno.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTurnoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTurno(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTurno(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTurno.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTurno(true);
			//this.isEsNuevoTurno=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTurno("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTurno(false) ;
			
			if(turnoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TurnoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTurno(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTurno(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTurnoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTurno.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTurno(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTurno==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTurno.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTurno(true);
			//this.isEsNuevoTurno=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.turno.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTurno("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTurno(false) ;
			
			if(TurnoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTurno(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTurno(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTurnoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTurno(false);
			
			//if(!this.isEsNuevoTurno) {								
				int intSelectedRow = this.jTableDatosTurno.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TurnoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTurno(this.turno,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
				
			}
			
			if(this.permiteMantenimiento(this.turno)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.turnoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTurno=true;
					this.inicializarActualizarBindingTablaTurno(false);
					this.isEsNuevoTurno=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTurno=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTurno=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTurno(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTurno(false);
				
				this.habilitarDeshabilitarControlesTurno(false);
			
												
				
				if(TurnoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTurno();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTurnoActionPerformed(evt,turnoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTurno(this.turno,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTurno.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,turnoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.turno.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Turno.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Turno.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTurnoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTurno.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
				this.turno.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
				this.turno.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.turno)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.turnoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TurnoModel) this.jTableDatosTurno.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTurno=true;
				this.inicializarActualizarBindingTablaTurno(false);
				this.isEsNuevoTurno=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTurno(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTurno(false);
				
				this.habilitarDeshabilitarControlesTurno(false);
				
				
				
				if(TurnoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTurno();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTurnoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTurno.getRowCount()>=1) {
				jTableDatosTurno.removeRowSelectionInterval(0, jTableDatosTurno.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTurno(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTurno(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTurno(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTurno(false) ;
			
			this.isEsNuevoTurno=false;
			
			if(TurnoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTurno();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTurnoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTurno(false);
				
				//SI ES MANUAL
				if(TurnoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTurno();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTurnoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTurno--;			
			//Turno turnoAux= new Turno();			
			//turnoAux.setId(this.iIdNuevoTurno);
			
			if(this.jInternalFrameDetalleFormTurno==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTurno();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
			
			this.turno.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.turnoLogic.getTurnos().add(this.turnoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.turnos.add(this.turnoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTurno(false);
			
			this.jTableDatosTurno.setRowSelectionInterval(this.getIndiceNuevoTurno(), this.getIndiceNuevoTurno());
			
			int iLastRow =  this.jTableDatosTurno.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTurno.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTurno.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTurno(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTurnoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTurno(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTurno(false);
			
			//SI ES MANUAL
			if(TurnoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTurno();
			}
			
			//this.abrirFrameTreeTurno();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTurnoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE TurnoS ?", "MANTENIMIENTO DE Turno", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTurno.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTurno();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.turnoReturnGeneral=turnoLogic.procesarImportacionTurnosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.turnoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTurnoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTurnoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTurno.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTurno.setFileImportacion(this.jInternalFrameImportacionTurno.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTurno.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTurno.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTurno.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTurno.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTurnoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Turno> turnosSeleccionados=new ArrayList<Turno>();		

		turnosSeleccionados=this.getTurnosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTurno.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTurno.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TurnoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TurnoBaseDesign.jrxml";
			
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
			
			this.generarReporteTurnos("Todos",turnosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.turnoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Turno",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTurno.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTurno.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TurnoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TurnoConstantesFunciones.LABEL_HORAENTRADA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_raEntrada_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_raEntrada_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_raEntrada_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_raEntrada_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_raSalida_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_raSalida_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_raSalida_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_raSalida_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESORECESO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_raIngresoReceso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_raIngresoReceso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_raIngresoReceso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_raIngresoReceso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDARECESO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_raSalidaReceso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_raSalidaReceso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_raSalidaReceso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_raSalidaReceso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TurnoConstantesFunciones.LABEL_HORADURANTERECESO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_raDuranteReceso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_raDuranteReceso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_raDuranteReceso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_raDuranteReceso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESOALMUERZO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_raIngresoAlmuerzo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_raIngresoAlmuerzo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_raIngresoAlmuerzo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_raIngresoAlmuerzo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDAALMUERZO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_raSalidaAlmuerzo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_raSalidaAlmuerzo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_raSalidaAlmuerzo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_raSalidaAlmuerzo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TurnoConstantesFunciones.LABEL_HORADURANTEALMUERZO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_raDuranteAlmuerzo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_raDuranteAlmuerzo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_raDuranteAlmuerzo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_raDuranteAlmuerzo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESO25:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_raIngreso25_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_raIngreso25_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_raIngreso25_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_raIngreso25_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDA25:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_raSalida25_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_raSalida25_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_raSalida25_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_raSalida25_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESO50:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_raIngreso50_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_raIngreso50_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_raIngreso50_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_raIngreso50_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDA50:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_raSalida50_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_raSalida50_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_raSalida50_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_raSalida50_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESO100:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_raIngreso100_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_raIngreso100_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_raIngreso100_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_raIngreso100_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDA100:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_raSalida100_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_raSalida100_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_raSalida100_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_raSalida100_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESO200:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_raIngreso200_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_raIngreso200_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_raIngreso200_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_raIngreso200_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDA200:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_raSalida200_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_raSalida200_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_raSalida200_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_raSalida200_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTurno.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTurno.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTurno.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TurnoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TurnoConstantesFunciones.LABEL_HORAENTRADA:
					sNombreCampoCategoria="hora_entrada";
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDA:
					sNombreCampoCategoria="hora_salida";
					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESORECESO:
					sNombreCampoCategoria="hora_ingreso_receso";
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDARECESO:
					sNombreCampoCategoria="hora_salida_receso";
					break;

				case TurnoConstantesFunciones.LABEL_HORADURANTERECESO:
					sNombreCampoCategoria="hora_durante_receso";
					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESOALMUERZO:
					sNombreCampoCategoria="hora_ingreso_almuerzo";
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDAALMUERZO:
					sNombreCampoCategoria="hora_salida_almuerzo";
					break;

				case TurnoConstantesFunciones.LABEL_HORADURANTEALMUERZO:
					sNombreCampoCategoria="hora_durante_almuerzo";
					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESO25:
					sNombreCampoCategoria="hora_ingreso25";
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDA25:
					sNombreCampoCategoria="hora_salida25";
					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESO50:
					sNombreCampoCategoria="hora_ingreso50";
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDA50:
					sNombreCampoCategoria="hora_salida50";
					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESO100:
					sNombreCampoCategoria="hora_ingreso100";
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDA100:
					sNombreCampoCategoria="hora_salida100";
					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESO200:
					sNombreCampoCategoria="hora_ingreso200";
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDA200:
					sNombreCampoCategoria="hora_salida200";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTurno.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TurnoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TurnoConstantesFunciones.LABEL_HORAENTRADA:
					sNombreCampoCategoriaValor="hora_entrada";
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDA:
					sNombreCampoCategoriaValor="hora_salida";
					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESORECESO:
					sNombreCampoCategoriaValor="hora_ingreso_receso";
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDARECESO:
					sNombreCampoCategoriaValor="hora_salida_receso";
					break;

				case TurnoConstantesFunciones.LABEL_HORADURANTERECESO:
					sNombreCampoCategoriaValor="hora_durante_receso";
					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESOALMUERZO:
					sNombreCampoCategoriaValor="hora_ingreso_almuerzo";
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDAALMUERZO:
					sNombreCampoCategoriaValor="hora_salida_almuerzo";
					break;

				case TurnoConstantesFunciones.LABEL_HORADURANTEALMUERZO:
					sNombreCampoCategoriaValor="hora_durante_almuerzo";
					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESO25:
					sNombreCampoCategoriaValor="hora_ingreso25";
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDA25:
					sNombreCampoCategoriaValor="hora_salida25";
					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESO50:
					sNombreCampoCategoriaValor="hora_ingreso50";
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDA50:
					sNombreCampoCategoriaValor="hora_salida50";
					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESO100:
					sNombreCampoCategoriaValor="hora_ingreso100";
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDA100:
					sNombreCampoCategoriaValor="hora_salida100";
					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESO200:
					sNombreCampoCategoriaValor="hora_ingreso200";
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDA200:
					sNombreCampoCategoriaValor="hora_salida200";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTurno.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTurno.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TurnoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TurnoConstantesFunciones.LABEL_HORAENTRADA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora Entrada",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora_entrada");
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora Salida",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora_salida");
					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESORECESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora Ingreso Receso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora_ingreso_receso");
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDARECESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora Salida Receso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora_salida_receso");
					break;

				case TurnoConstantesFunciones.LABEL_HORADURANTERECESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora Durante Receso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora_durante_receso");
					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESOALMUERZO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora Ingreso Almuerzo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora_ingreso_almuerzo");
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDAALMUERZO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora Salida Almuerzo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora_salida_almuerzo");
					break;

				case TurnoConstantesFunciones.LABEL_HORADURANTEALMUERZO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora Durante Almuerzo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora_durante_almuerzo");
					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESO25:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora Ingreso25",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora_ingreso25");
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDA25:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora Salida25",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora_salida25");
					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESO50:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora Ingreso50",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora_ingreso50");
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDA50:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora Salida50",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora_salida50");
					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESO100:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora Ingreso100",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora_ingreso100");
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDA100:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora Salida100",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora_salida100");
					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESO200:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora Ingreso200",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora_ingreso200");
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDA200:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora Salida200",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora_salida200");
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
	
	public void jButtonGenerarExcelReporteDinamicoTurnoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Turno> turnosSeleccionados=new ArrayList<Turno>();		
		
		turnosSeleccionados=this.getTurnosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"turno";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Turnos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTurno.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTurno.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TurnoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TurnoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Turno turno:turnosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(turno.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TurnoConstantesFunciones.LABEL_HORAENTRADA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TurnoConstantesFunciones.LABEL_HORAENTRADA);
					iRow++;

					for(Turno turno:turnosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(turno.gethora_entrada());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TurnoConstantesFunciones.LABEL_HORASALIDA);
					iRow++;

					for(Turno turno:turnosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(turno.gethora_salida());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESORECESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TurnoConstantesFunciones.LABEL_HORAINGRESORECESO);
					iRow++;

					for(Turno turno:turnosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(turno.gethora_ingreso_receso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDARECESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TurnoConstantesFunciones.LABEL_HORASALIDARECESO);
					iRow++;

					for(Turno turno:turnosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(turno.gethora_salida_receso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TurnoConstantesFunciones.LABEL_HORADURANTERECESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TurnoConstantesFunciones.LABEL_HORADURANTERECESO);
					iRow++;

					for(Turno turno:turnosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(turno.gethora_durante_receso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESOALMUERZO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TurnoConstantesFunciones.LABEL_HORAINGRESOALMUERZO);
					iRow++;

					for(Turno turno:turnosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(turno.gethora_ingreso_almuerzo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDAALMUERZO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TurnoConstantesFunciones.LABEL_HORASALIDAALMUERZO);
					iRow++;

					for(Turno turno:turnosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(turno.gethora_salida_almuerzo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TurnoConstantesFunciones.LABEL_HORADURANTEALMUERZO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TurnoConstantesFunciones.LABEL_HORADURANTEALMUERZO);
					iRow++;

					for(Turno turno:turnosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(turno.gethora_durante_almuerzo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESO25:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TurnoConstantesFunciones.LABEL_HORAINGRESO25);
					iRow++;

					for(Turno turno:turnosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(turno.gethora_ingreso25());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDA25:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TurnoConstantesFunciones.LABEL_HORASALIDA25);
					iRow++;

					for(Turno turno:turnosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(turno.gethora_salida25());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESO50:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TurnoConstantesFunciones.LABEL_HORAINGRESO50);
					iRow++;

					for(Turno turno:turnosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(turno.gethora_ingreso50());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDA50:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TurnoConstantesFunciones.LABEL_HORASALIDA50);
					iRow++;

					for(Turno turno:turnosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(turno.gethora_salida50());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESO100:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TurnoConstantesFunciones.LABEL_HORAINGRESO100);
					iRow++;

					for(Turno turno:turnosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(turno.gethora_ingreso100());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDA100:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TurnoConstantesFunciones.LABEL_HORASALIDA100);
					iRow++;

					for(Turno turno:turnosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(turno.gethora_salida100());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TurnoConstantesFunciones.LABEL_HORAINGRESO200:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TurnoConstantesFunciones.LABEL_HORAINGRESO200);
					iRow++;

					for(Turno turno:turnosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(turno.gethora_ingreso200());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TurnoConstantesFunciones.LABEL_HORASALIDA200:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TurnoConstantesFunciones.LABEL_HORASALIDA200);
					iRow++;

					for(Turno turno:turnosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(turno.gethora_salida200());
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
			//	this.getFilaCabeceraExportarExcelTurno(row);				
			//	iRow++;
			//}				
			
			//for(Turno turnoAux:turnosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTurno(turnoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.turnoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Turno",JOptionPane.INFORMATION_MESSAGE);
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
				this.turnoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTurno(false);
			
			//SI ES MANUAL
			if(TurnoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTurno();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTurnoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTurno(false);
			
			//SI ES MANUAL
			if(TurnoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTurno();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTurnoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTurno(false);
			
			//SI ES MANUAL
			if(TurnoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTurno();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTurno() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTurno.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTurno.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTurno.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTurno.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTurno.setMinimumSize(dimensionMinimum);
		this.jTableDatosTurno.setMaximumSize(dimensionMaximum);
		this.jTableDatosTurno.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTurno(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTurno(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTurno(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTurno(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTurno(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.turnoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTurno(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTurno(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTurno(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TurnoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TurnoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTurno() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTurno();
		
		this.inicializarActualizarBindingBotonesManualTurno(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.turnoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTurno();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTurno() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTurno(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTurno(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTurno.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTurno.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTurno.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTurno!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTurno.jCheckBoxPostAccionNuevoTurno.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTurno.jCheckBoxPostAccionSinCerrarTurno.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTurno.jCheckBoxPostAccionSinMensajeTurno.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTurno.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTurno.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTurno.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTurno!=null) {
				this.jInternalFrameDetalleFormTurno.jCheckBoxPostAccionNuevoTurno.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTurno.jCheckBoxPostAccionSinCerrarTurno.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTurno.jCheckBoxPostAccionSinMensajeTurno.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTurno.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTurno.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTurno!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTurno.jComboBoxTiposAccionesFormularioTurno.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTurno.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTurno!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTurno.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTurno.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTurno.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTurno.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTurno.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTurno!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTurno.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTurno.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTurno.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTurno(Boolean esInicializar) throws Exception {
		try	{	
			if(TurnoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTurno(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTurno() throws Exception {
		try	{
			if(TurnoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTurno();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTurno() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTurno.jComboBoxTiposAccionesFormularioTurno.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTurno.jComboBoxTiposAccionesFormularioTurno.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTurno() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTurno.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTurno.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTurno.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTurno.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTurno.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTurno.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTurno.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTurno.addItem(reporte);
			}
			
			
			if(!this.turnoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTurno.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTurno.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTurno.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTurno.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTurno.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTurno.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTurno!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTurno.jComboBoxTiposAccionesFormularioTurno.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTurno.jComboBoxTiposAccionesFormularioTurno.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTurno.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTurno.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTurno.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTurno();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTurno() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTurno!=null) {
				this.jInternalFrameReporteDinamicoTurno.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTurno.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTurno!=null) {
				this.jInternalFrameReporteDinamicoTurno.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTurno.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTurno!=null) {
				
				if(this.jInternalFrameReporteDinamicoTurno.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTurno.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTurno.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTurno.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTurno.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTurno.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTurno()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTurno(Boolean esInicializar) throws Exception {				
		if(TurnoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTurno();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTurno() throws Exception {
		this.inicializarActualizarBindingTablaTurno(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTurno() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTurno.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTurno.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTurno.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TurnoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTurno.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTurno.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TurnoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTurnoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurnoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TurnoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTurno.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTurno.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TurnoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTurno.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTurno(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=turnoLogic.getTurnos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=turnos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TurnoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTurno.setModel(new TurnoModel(this.turnoLogic.getTurnos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTurno.setModel(new TurnoModel(this.turnos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTurno!=null && this.jInternalFrameOrderByTurno.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTurno();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurno,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TurnoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TurnoConstantesFunciones.SCLASSWEBTITULO,turnoConstantesFunciones.resaltarSeleccionarTurno,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TurnoConstantesFunciones.SCLASSWEBTITULO,turnoConstantesFunciones.resaltarSeleccionarTurno,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurno,TurnoConstantesFunciones.LABEL_ID));

		if(this.turnoConstantesFunciones.mostraridTurno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TurnoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.turnoConstantesFunciones.resaltaridTurno,this.turnoConstantesFunciones.activaridTurno,this,true,"idTurno","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.turnoConstantesFunciones.resaltaridTurno,this.turnoConstantesFunciones.activaridTurno,this,true,"idTurno","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurno,TurnoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.turnoConstantesFunciones.mostrarid_empresaTurno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TurnoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.turnoConstantesFunciones.resaltarid_empresaTurno,this,this.turnoConstantesFunciones.activarid_empresaTurno));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.turnoConstantesFunciones.resaltarid_empresaTurno,this,this.turnoConstantesFunciones.activarid_empresaTurno,false,"id_empresaTurno","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TurnoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurno,TurnoConstantesFunciones.LABEL_HORAENTRADA));

		if(this.turnoConstantesFunciones.mostrarhora_entradaTurno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TurnoConstantesFunciones.LABEL_HORAENTRADA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.turnoConstantesFunciones.resaltarhora_entradaTurno,this.turnoConstantesFunciones.activarhora_entradaTurno,this,true,"hora_entradaTurno","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.turnoConstantesFunciones.resaltarhora_entradaTurno,this.turnoConstantesFunciones.activarhora_entradaTurno,this,true,"hora_entradaTurno","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TurnoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurno,TurnoConstantesFunciones.LABEL_HORASALIDA));

		if(this.turnoConstantesFunciones.mostrarhora_salidaTurno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TurnoConstantesFunciones.LABEL_HORASALIDA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.turnoConstantesFunciones.resaltarhora_salidaTurno,this.turnoConstantesFunciones.activarhora_salidaTurno,this,true,"hora_salidaTurno","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.turnoConstantesFunciones.resaltarhora_salidaTurno,this.turnoConstantesFunciones.activarhora_salidaTurno,this,true,"hora_salidaTurno","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TurnoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurno,TurnoConstantesFunciones.LABEL_HORAINGRESORECESO));

		if(this.turnoConstantesFunciones.mostrarhora_ingreso_recesoTurno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TurnoConstantesFunciones.LABEL_HORAINGRESORECESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.turnoConstantesFunciones.resaltarhora_ingreso_recesoTurno,this.turnoConstantesFunciones.activarhora_ingreso_recesoTurno,this,true,"hora_ingreso_recesoTurno","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.turnoConstantesFunciones.resaltarhora_ingreso_recesoTurno,this.turnoConstantesFunciones.activarhora_ingreso_recesoTurno,this,true,"hora_ingreso_recesoTurno","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TurnoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurno,TurnoConstantesFunciones.LABEL_HORASALIDARECESO));

		if(this.turnoConstantesFunciones.mostrarhora_salida_recesoTurno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TurnoConstantesFunciones.LABEL_HORASALIDARECESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.turnoConstantesFunciones.resaltarhora_salida_recesoTurno,this.turnoConstantesFunciones.activarhora_salida_recesoTurno,this,true,"hora_salida_recesoTurno","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.turnoConstantesFunciones.resaltarhora_salida_recesoTurno,this.turnoConstantesFunciones.activarhora_salida_recesoTurno,this,true,"hora_salida_recesoTurno","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TurnoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurno,TurnoConstantesFunciones.LABEL_HORADURANTERECESO));

		if(this.turnoConstantesFunciones.mostrarhora_durante_recesoTurno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TurnoConstantesFunciones.LABEL_HORADURANTERECESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.turnoConstantesFunciones.resaltarhora_durante_recesoTurno,this.turnoConstantesFunciones.activarhora_durante_recesoTurno,this,true,"hora_durante_recesoTurno","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.turnoConstantesFunciones.resaltarhora_durante_recesoTurno,this.turnoConstantesFunciones.activarhora_durante_recesoTurno,this,true,"hora_durante_recesoTurno","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TurnoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurno,TurnoConstantesFunciones.LABEL_HORAINGRESOALMUERZO));

		if(this.turnoConstantesFunciones.mostrarhora_ingreso_almuerzoTurno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TurnoConstantesFunciones.LABEL_HORAINGRESOALMUERZO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.turnoConstantesFunciones.resaltarhora_ingreso_almuerzoTurno,this.turnoConstantesFunciones.activarhora_ingreso_almuerzoTurno,this,true,"hora_ingreso_almuerzoTurno","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.turnoConstantesFunciones.resaltarhora_ingreso_almuerzoTurno,this.turnoConstantesFunciones.activarhora_ingreso_almuerzoTurno,this,true,"hora_ingreso_almuerzoTurno","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TurnoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurno,TurnoConstantesFunciones.LABEL_HORASALIDAALMUERZO));

		if(this.turnoConstantesFunciones.mostrarhora_salida_almuerzoTurno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TurnoConstantesFunciones.LABEL_HORASALIDAALMUERZO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.turnoConstantesFunciones.resaltarhora_salida_almuerzoTurno,this.turnoConstantesFunciones.activarhora_salida_almuerzoTurno,this,true,"hora_salida_almuerzoTurno","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.turnoConstantesFunciones.resaltarhora_salida_almuerzoTurno,this.turnoConstantesFunciones.activarhora_salida_almuerzoTurno,this,true,"hora_salida_almuerzoTurno","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TurnoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurno,TurnoConstantesFunciones.LABEL_HORADURANTEALMUERZO));

		if(this.turnoConstantesFunciones.mostrarhora_durante_almuerzoTurno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TurnoConstantesFunciones.LABEL_HORADURANTEALMUERZO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.turnoConstantesFunciones.resaltarhora_durante_almuerzoTurno,this.turnoConstantesFunciones.activarhora_durante_almuerzoTurno,this,true,"hora_durante_almuerzoTurno","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.turnoConstantesFunciones.resaltarhora_durante_almuerzoTurno,this.turnoConstantesFunciones.activarhora_durante_almuerzoTurno,this,true,"hora_durante_almuerzoTurno","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TurnoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurno,TurnoConstantesFunciones.LABEL_HORAINGRESO25));

		if(this.turnoConstantesFunciones.mostrarhora_ingreso25Turno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TurnoConstantesFunciones.LABEL_HORAINGRESO25,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.turnoConstantesFunciones.resaltarhora_ingreso25Turno,this.turnoConstantesFunciones.activarhora_ingreso25Turno,this,true,"hora_ingreso25Turno","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.turnoConstantesFunciones.resaltarhora_ingreso25Turno,this.turnoConstantesFunciones.activarhora_ingreso25Turno,this,true,"hora_ingreso25Turno","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TurnoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurno,TurnoConstantesFunciones.LABEL_HORASALIDA25));

		if(this.turnoConstantesFunciones.mostrarhora_salida25Turno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TurnoConstantesFunciones.LABEL_HORASALIDA25,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.turnoConstantesFunciones.resaltarhora_salida25Turno,this.turnoConstantesFunciones.activarhora_salida25Turno,this,true,"hora_salida25Turno","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.turnoConstantesFunciones.resaltarhora_salida25Turno,this.turnoConstantesFunciones.activarhora_salida25Turno,this,true,"hora_salida25Turno","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TurnoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurno,TurnoConstantesFunciones.LABEL_HORAINGRESO50));

		if(this.turnoConstantesFunciones.mostrarhora_ingreso50Turno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TurnoConstantesFunciones.LABEL_HORAINGRESO50,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.turnoConstantesFunciones.resaltarhora_ingreso50Turno,this.turnoConstantesFunciones.activarhora_ingreso50Turno,this,true,"hora_ingreso50Turno","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.turnoConstantesFunciones.resaltarhora_ingreso50Turno,this.turnoConstantesFunciones.activarhora_ingreso50Turno,this,true,"hora_ingreso50Turno","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TurnoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurno,TurnoConstantesFunciones.LABEL_HORASALIDA50));

		if(this.turnoConstantesFunciones.mostrarhora_salida50Turno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TurnoConstantesFunciones.LABEL_HORASALIDA50,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.turnoConstantesFunciones.resaltarhora_salida50Turno,this.turnoConstantesFunciones.activarhora_salida50Turno,this,true,"hora_salida50Turno","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.turnoConstantesFunciones.resaltarhora_salida50Turno,this.turnoConstantesFunciones.activarhora_salida50Turno,this,true,"hora_salida50Turno","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TurnoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurno,TurnoConstantesFunciones.LABEL_HORAINGRESO100));

		if(this.turnoConstantesFunciones.mostrarhora_ingreso100Turno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TurnoConstantesFunciones.LABEL_HORAINGRESO100,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.turnoConstantesFunciones.resaltarhora_ingreso100Turno,this.turnoConstantesFunciones.activarhora_ingreso100Turno,this,true,"hora_ingreso100Turno","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.turnoConstantesFunciones.resaltarhora_ingreso100Turno,this.turnoConstantesFunciones.activarhora_ingreso100Turno,this,true,"hora_ingreso100Turno","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TurnoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurno,TurnoConstantesFunciones.LABEL_HORASALIDA100));

		if(this.turnoConstantesFunciones.mostrarhora_salida100Turno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TurnoConstantesFunciones.LABEL_HORASALIDA100,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.turnoConstantesFunciones.resaltarhora_salida100Turno,this.turnoConstantesFunciones.activarhora_salida100Turno,this,true,"hora_salida100Turno","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.turnoConstantesFunciones.resaltarhora_salida100Turno,this.turnoConstantesFunciones.activarhora_salida100Turno,this,true,"hora_salida100Turno","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TurnoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurno,TurnoConstantesFunciones.LABEL_HORAINGRESO200));

		if(this.turnoConstantesFunciones.mostrarhora_ingreso200Turno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TurnoConstantesFunciones.LABEL_HORAINGRESO200,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.turnoConstantesFunciones.resaltarhora_ingreso200Turno,this.turnoConstantesFunciones.activarhora_ingreso200Turno,this,true,"hora_ingreso200Turno","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.turnoConstantesFunciones.resaltarhora_ingreso200Turno,this.turnoConstantesFunciones.activarhora_ingreso200Turno,this,true,"hora_ingreso200Turno","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TurnoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTurno,TurnoConstantesFunciones.LABEL_HORASALIDA200));

		if(this.turnoConstantesFunciones.mostrarhora_salida200Turno && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TurnoConstantesFunciones.LABEL_HORASALIDA200,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.turnoConstantesFunciones.resaltarhora_salida200Turno,this.turnoConstantesFunciones.activarhora_salida200Turno,this,true,"hora_salida200Turno","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.turnoConstantesFunciones.resaltarhora_salida200Turno,this.turnoConstantesFunciones.activarhora_salida200Turno,this,true,"hora_salida200Turno","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TurnoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.turnoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.turnoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.turnoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTurno.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.turnoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.turnoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTurno.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTurno && this.isPermisoGuardarCambiosTurno) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.turnoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.turnoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTurno.addColumn(tableColumn);
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
			
			this.jTableDatosTurno.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTurno && this.isPermisoGuardarCambiosTurno) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTurno && this.isPermisoGuardarCambiosTurno) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTurno.moveColumn(this.jTableDatosTurno.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTurno.moveColumn(this.jTableDatosTurno.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTurno.moveColumn(this.jTableDatosTurno.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTurno.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTurno.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTurno,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TurnoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTurno.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTurno.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TurnoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TurnoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTurno.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTurno.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTurno.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=turnoLogic.getTurnos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=turnos.size()-1;
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
		//this.jTableDatosTurno.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTurno.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTurno();
			
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
				
				//this.isEsNuevoTurno=false;
					
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
			
				if(this.turnoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTurno==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTurno.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTurno.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.turno.getsType().equals("DUPLICADO")
				   || this.turno.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTurno=true;
				
				} else {
					this.isEsNuevoTurno=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.turnoSessionBean.getEsGuardarRelacionado()) {
					if(this.turno.getId()>=0 && !this.turno.getIsNew()) {						
						this.isEsNuevoTurno=false;
						
					} else {
						this.isEsNuevoTurno=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTurno(esRelaciones);						
				
				this.seleccionarTurno(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.turno.getId()<0) {
					this.isEsNuevoTurno=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTurno(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTurno(evt,rowIndex);
				}	
				
				if(this.turnoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Turno: " + this.dDif); 
					}
				}								
				
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTurno(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.turno)) {
					if(this.turno.getId()>0) {
						this.turno.setIsDeleted(true);
						
						this.turnosEliminados.add(this.turno);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.turnoLogic.getTurnos().remove(this.turno);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.turnos.remove(this.turno);				
					}
					
					
					((TurnoModel) this.jTableDatosTurno.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTurno(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTurno(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTurno) {
			
			if(this.jInternalFrameDetalleFormTurno==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTurno.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTurno.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TurnoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTurno(this.turno);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.turnoConstantesFunciones.cargarid_empresaTurno || this.turnoConstantesFunciones.event_dependid_empresaTurno) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.turno.getid_empresa());
									//this.inicializarActualizarBindingTurno(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(turno.getEmpresa()!=null) {
							this.empresasForeignKey.add(turno.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.turno.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTurno("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTurno(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTurno() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTurno(Turno turno) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTurno(turno,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTurno(Turno turno,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTurno(turno);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTurno(turno,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTurno(turno);
	}
	
	public void setVariablesObjetoActualToFormularioTurno(Turno turno) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTurno==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTurno.jLabelidTurno.setText(turno.getId().toString());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_entradaTurno.setValue(turno.gethora_entrada());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_salidaTurno.setValue(turno.gethora_salida());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso_recesoTurno.setValue(turno.gethora_ingreso_receso());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida_recesoTurno.setValue(turno.gethora_salida_receso());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_durante_recesoTurno.setValue(turno.gethora_durante_receso());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso_almuerzoTurno.setValue(turno.gethora_ingreso_almuerzo());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida_almuerzoTurno.setValue(turno.gethora_salida_almuerzo());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_durante_almuerzoTurno.setValue(turno.gethora_durante_almuerzo());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso25Turno.setValue(turno.gethora_ingreso25());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida25Turno.setValue(turno.gethora_salida25());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso50Turno.setValue(turno.gethora_ingreso50());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida50Turno.setValue(turno.gethora_salida50());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso100Turno.setValue(turno.gethora_ingreso100());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida100Turno.setValue(turno.gethora_salida100());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso200Turno.setValue(turno.gethora_ingreso200());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida200Turno.setValue(turno.gethora_salida200());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Turno turnoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,turnoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Turno turnoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				turnoLocal=this.turno;
			} else {
				turnoLocal=this.turnoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(turnoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTurno(turnoLocal,true);
					
					if(turnoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(turnoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.turnoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(turnoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTurno(Turno turno,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTurno(turno,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTurno(turno);
	}
	
	public void setVariablesFormularioToObjetoActualTurno(Turno turno,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTurno(turno,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTurno(Turno turno,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTurno==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTurno.jLabelidTurno.getText()==null || this.jInternalFrameDetalleFormTurno.jLabelidTurno.getText()=="" || this.jInternalFrameDetalleFormTurno.jLabelidTurno.getText()=="Id") {
				this.jInternalFrameDetalleFormTurno.jLabelidTurno.setText("0");
			}

			if(conColumnasBase) {turno.setId(Long.parseLong(this.jInternalFrameDetalleFormTurno.jLabelidTurno.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TurnoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelIdTurno,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			turno.sethora_entrada(new Time(((Date)this.jInternalFrameDetalleFormTurno.jSpinnerhora_entradaTurno.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TurnoConstantesFunciones.LABEL_HORAENTRADA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_entradaTurno,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			turno.sethora_salida(new Time(((Date)this.jInternalFrameDetalleFormTurno.jSpinnerhora_salidaTurno.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TurnoConstantesFunciones.LABEL_HORASALIDA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_salidaTurno,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			turno.sethora_ingreso_receso(new Time(((Date)this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso_recesoTurno.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TurnoConstantesFunciones.LABEL_HORAINGRESORECESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_ingreso_recesoTurno,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			turno.sethora_salida_receso(new Time(((Date)this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida_recesoTurno.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TurnoConstantesFunciones.LABEL_HORASALIDARECESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_salida_recesoTurno,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			turno.sethora_durante_receso(new Time(((Date)this.jInternalFrameDetalleFormTurno.jSpinnerhora_durante_recesoTurno.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TurnoConstantesFunciones.LABEL_HORADURANTERECESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_durante_recesoTurno,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			turno.sethora_ingreso_almuerzo(new Time(((Date)this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso_almuerzoTurno.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TurnoConstantesFunciones.LABEL_HORAINGRESOALMUERZO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_ingreso_almuerzoTurno,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			turno.sethora_salida_almuerzo(new Time(((Date)this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida_almuerzoTurno.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TurnoConstantesFunciones.LABEL_HORASALIDAALMUERZO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_salida_almuerzoTurno,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			turno.sethora_durante_almuerzo(new Time(((Date)this.jInternalFrameDetalleFormTurno.jSpinnerhora_durante_almuerzoTurno.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TurnoConstantesFunciones.LABEL_HORADURANTEALMUERZO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_durante_almuerzoTurno,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			turno.sethora_ingreso25(new Time(((Date)this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso25Turno.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TurnoConstantesFunciones.LABEL_HORAINGRESO25+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_ingreso25Turno,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			turno.sethora_salida25(new Time(((Date)this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida25Turno.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TurnoConstantesFunciones.LABEL_HORASALIDA25+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_salida25Turno,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			turno.sethora_ingreso50(new Time(((Date)this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso50Turno.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TurnoConstantesFunciones.LABEL_HORAINGRESO50+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_ingreso50Turno,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			turno.sethora_salida50(new Time(((Date)this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida50Turno.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TurnoConstantesFunciones.LABEL_HORASALIDA50+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_salida50Turno,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			turno.sethora_ingreso100(new Time(((Date)this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso100Turno.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TurnoConstantesFunciones.LABEL_HORAINGRESO100+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_ingreso100Turno,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			turno.sethora_salida100(new Time(((Date)this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida100Turno.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TurnoConstantesFunciones.LABEL_HORASALIDA100+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_salida100Turno,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			turno.sethora_ingreso200(new Time(((Date)this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso200Turno.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TurnoConstantesFunciones.LABEL_HORAINGRESO200+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_ingreso200Turno,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			turno.sethora_salida200(new Time(((Date)this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida200Turno.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TurnoConstantesFunciones.LABEL_HORASALIDA200+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTurno.jLabelhora_salida200Turno,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTurno(Turno turnoBean,Turno turno,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTurno(Turno turnoOrigen,Turno turno,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && turnoOrigen.getId()!=null && !turnoOrigen.getId().equals(0L))) {turno.setId(turnoOrigen.getId());}}
			if(conDefault || (!conDefault && turnoOrigen.gethora_entrada()!=null && !turnoOrigen.gethora_entrada().equals(new Time((new Date()).getTime())))) {turno.sethora_entrada(turnoOrigen.gethora_entrada());}
			if(conDefault || (!conDefault && turnoOrigen.gethora_salida()!=null && !turnoOrigen.gethora_salida().equals(new Time((new Date()).getTime())))) {turno.sethora_salida(turnoOrigen.gethora_salida());}
			if(conDefault || (!conDefault && turnoOrigen.gethora_ingreso_receso()!=null && !turnoOrigen.gethora_ingreso_receso().equals(new Time((new Date()).getTime())))) {turno.sethora_ingreso_receso(turnoOrigen.gethora_ingreso_receso());}
			if(conDefault || (!conDefault && turnoOrigen.gethora_salida_receso()!=null && !turnoOrigen.gethora_salida_receso().equals(new Time((new Date()).getTime())))) {turno.sethora_salida_receso(turnoOrigen.gethora_salida_receso());}
			if(conDefault || (!conDefault && turnoOrigen.gethora_durante_receso()!=null && !turnoOrigen.gethora_durante_receso().equals(new Time((new Date()).getTime())))) {turno.sethora_durante_receso(turnoOrigen.gethora_durante_receso());}
			if(conDefault || (!conDefault && turnoOrigen.gethora_ingreso_almuerzo()!=null && !turnoOrigen.gethora_ingreso_almuerzo().equals(new Time((new Date()).getTime())))) {turno.sethora_ingreso_almuerzo(turnoOrigen.gethora_ingreso_almuerzo());}
			if(conDefault || (!conDefault && turnoOrigen.gethora_salida_almuerzo()!=null && !turnoOrigen.gethora_salida_almuerzo().equals(new Time((new Date()).getTime())))) {turno.sethora_salida_almuerzo(turnoOrigen.gethora_salida_almuerzo());}
			if(conDefault || (!conDefault && turnoOrigen.gethora_durante_almuerzo()!=null && !turnoOrigen.gethora_durante_almuerzo().equals(new Time((new Date()).getTime())))) {turno.sethora_durante_almuerzo(turnoOrigen.gethora_durante_almuerzo());}
			if(conDefault || (!conDefault && turnoOrigen.gethora_ingreso25()!=null && !turnoOrigen.gethora_ingreso25().equals(new Time((new Date()).getTime())))) {turno.sethora_ingreso25(turnoOrigen.gethora_ingreso25());}
			if(conDefault || (!conDefault && turnoOrigen.gethora_salida25()!=null && !turnoOrigen.gethora_salida25().equals(new Time((new Date()).getTime())))) {turno.sethora_salida25(turnoOrigen.gethora_salida25());}
			if(conDefault || (!conDefault && turnoOrigen.gethora_ingreso50()!=null && !turnoOrigen.gethora_ingreso50().equals(new Time((new Date()).getTime())))) {turno.sethora_ingreso50(turnoOrigen.gethora_ingreso50());}
			if(conDefault || (!conDefault && turnoOrigen.gethora_salida50()!=null && !turnoOrigen.gethora_salida50().equals(new Time((new Date()).getTime())))) {turno.sethora_salida50(turnoOrigen.gethora_salida50());}
			if(conDefault || (!conDefault && turnoOrigen.gethora_ingreso100()!=null && !turnoOrigen.gethora_ingreso100().equals(new Time((new Date()).getTime())))) {turno.sethora_ingreso100(turnoOrigen.gethora_ingreso100());}
			if(conDefault || (!conDefault && turnoOrigen.gethora_salida100()!=null && !turnoOrigen.gethora_salida100().equals(new Time((new Date()).getTime())))) {turno.sethora_salida100(turnoOrigen.gethora_salida100());}
			if(conDefault || (!conDefault && turnoOrigen.gethora_ingreso200()!=null && !turnoOrigen.gethora_ingreso200().equals(new Time((new Date()).getTime())))) {turno.sethora_ingreso200(turnoOrigen.gethora_ingreso200());}
			if(conDefault || (!conDefault && turnoOrigen.gethora_salida200()!=null && !turnoOrigen.gethora_salida200().equals(new Time((new Date()).getTime())))) {turno.sethora_salida200(turnoOrigen.gethora_salida200());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTurno(Turno turno) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTurno.jLabelidTurno.setText(turno.getId().toString());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_entradaTurno.setValue(turno.gethora_entrada());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_salidaTurno.setValue(turno.gethora_salida());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso_recesoTurno.setValue(turno.gethora_ingreso_receso());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida_recesoTurno.setValue(turno.gethora_salida_receso());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_durante_recesoTurno.setValue(turno.gethora_durante_receso());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso_almuerzoTurno.setValue(turno.gethora_ingreso_almuerzo());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida_almuerzoTurno.setValue(turno.gethora_salida_almuerzo());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_durante_almuerzoTurno.setValue(turno.gethora_durante_almuerzo());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso25Turno.setValue(turno.gethora_ingreso25());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida25Turno.setValue(turno.gethora_salida25());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso50Turno.setValue(turno.gethora_ingreso50());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida50Turno.setValue(turno.gethora_salida50());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso100Turno.setValue(turno.gethora_ingreso100());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida100Turno.setValue(turno.gethora_salida100());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso200Turno.setValue(turno.gethora_ingreso200());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida200Turno.setValue(turno.gethora_salida200());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTurno(TurnoBean turnoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTurno.jLabelidTurno.setText(turnoBean.getId().toString());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_entradaTurno.setValue(turnoBean.gethora_entrada());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_salidaTurno.setValue(turnoBean.gethora_salida());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso_recesoTurno.setValue(turnoBean.gethora_ingreso_receso());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida_recesoTurno.setValue(turnoBean.gethora_salida_receso());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_durante_recesoTurno.setValue(turnoBean.gethora_durante_receso());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso_almuerzoTurno.setValue(turnoBean.gethora_ingreso_almuerzo());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida_almuerzoTurno.setValue(turnoBean.gethora_salida_almuerzo());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_durante_almuerzoTurno.setValue(turnoBean.gethora_durante_almuerzo());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso25Turno.setValue(turnoBean.gethora_ingreso25());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida25Turno.setValue(turnoBean.gethora_salida25());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso50Turno.setValue(turnoBean.gethora_ingreso50());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida50Turno.setValue(turnoBean.gethora_salida50());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso100Turno.setValue(turnoBean.gethora_ingreso100());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida100Turno.setValue(turnoBean.gethora_salida100());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso200Turno.setValue(turnoBean.gethora_ingreso200());
			this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida200Turno.setValue(turnoBean.gethora_salida200());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTurno(TurnoParameterReturnGeneral turnoReturnGeneral,TurnoBean turnoBean,Boolean conDefault) throws Exception { 
		try {
			Turno turnoLocal=new Turno();
			
			turnoLocal=turnoReturnGeneral.getTurno();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && turnoLocal.getId()!=null && !turnoLocal.getId().equals(0L))) {turnoBean.setId(turnoLocal.getId());}}
			if(conDefault || (!conDefault && turnoLocal.gethora_entrada()!=null && !turnoLocal.gethora_entrada().equals(new Time((new Date()).getTime())))) {turnoBean.sethora_entrada(turnoLocal.gethora_entrada());}
			if(conDefault || (!conDefault && turnoLocal.gethora_salida()!=null && !turnoLocal.gethora_salida().equals(new Time((new Date()).getTime())))) {turnoBean.sethora_salida(turnoLocal.gethora_salida());}
			if(conDefault || (!conDefault && turnoLocal.gethora_ingreso_receso()!=null && !turnoLocal.gethora_ingreso_receso().equals(new Time((new Date()).getTime())))) {turnoBean.sethora_ingreso_receso(turnoLocal.gethora_ingreso_receso());}
			if(conDefault || (!conDefault && turnoLocal.gethora_salida_receso()!=null && !turnoLocal.gethora_salida_receso().equals(new Time((new Date()).getTime())))) {turnoBean.sethora_salida_receso(turnoLocal.gethora_salida_receso());}
			if(conDefault || (!conDefault && turnoLocal.gethora_durante_receso()!=null && !turnoLocal.gethora_durante_receso().equals(new Time((new Date()).getTime())))) {turnoBean.sethora_durante_receso(turnoLocal.gethora_durante_receso());}
			if(conDefault || (!conDefault && turnoLocal.gethora_ingreso_almuerzo()!=null && !turnoLocal.gethora_ingreso_almuerzo().equals(new Time((new Date()).getTime())))) {turnoBean.sethora_ingreso_almuerzo(turnoLocal.gethora_ingreso_almuerzo());}
			if(conDefault || (!conDefault && turnoLocal.gethora_salida_almuerzo()!=null && !turnoLocal.gethora_salida_almuerzo().equals(new Time((new Date()).getTime())))) {turnoBean.sethora_salida_almuerzo(turnoLocal.gethora_salida_almuerzo());}
			if(conDefault || (!conDefault && turnoLocal.gethora_durante_almuerzo()!=null && !turnoLocal.gethora_durante_almuerzo().equals(new Time((new Date()).getTime())))) {turnoBean.sethora_durante_almuerzo(turnoLocal.gethora_durante_almuerzo());}
			if(conDefault || (!conDefault && turnoLocal.gethora_ingreso25()!=null && !turnoLocal.gethora_ingreso25().equals(new Time((new Date()).getTime())))) {turnoBean.sethora_ingreso25(turnoLocal.gethora_ingreso25());}
			if(conDefault || (!conDefault && turnoLocal.gethora_salida25()!=null && !turnoLocal.gethora_salida25().equals(new Time((new Date()).getTime())))) {turnoBean.sethora_salida25(turnoLocal.gethora_salida25());}
			if(conDefault || (!conDefault && turnoLocal.gethora_ingreso50()!=null && !turnoLocal.gethora_ingreso50().equals(new Time((new Date()).getTime())))) {turnoBean.sethora_ingreso50(turnoLocal.gethora_ingreso50());}
			if(conDefault || (!conDefault && turnoLocal.gethora_salida50()!=null && !turnoLocal.gethora_salida50().equals(new Time((new Date()).getTime())))) {turnoBean.sethora_salida50(turnoLocal.gethora_salida50());}
			if(conDefault || (!conDefault && turnoLocal.gethora_ingreso100()!=null && !turnoLocal.gethora_ingreso100().equals(new Time((new Date()).getTime())))) {turnoBean.sethora_ingreso100(turnoLocal.gethora_ingreso100());}
			if(conDefault || (!conDefault && turnoLocal.gethora_salida100()!=null && !turnoLocal.gethora_salida100().equals(new Time((new Date()).getTime())))) {turnoBean.sethora_salida100(turnoLocal.gethora_salida100());}
			if(conDefault || (!conDefault && turnoLocal.gethora_ingreso200()!=null && !turnoLocal.gethora_ingreso200().equals(new Time((new Date()).getTime())))) {turnoBean.sethora_ingreso200(turnoLocal.gethora_ingreso200());}
			if(conDefault || (!conDefault && turnoLocal.gethora_salida200()!=null && !turnoLocal.gethora_salida200().equals(new Time((new Date()).getTime())))) {turnoBean.sethora_salida200(turnoLocal.gethora_salida200());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTurnoGenerico(Long idTurnoSeleccionado,JComboBox jComboBoxTurno,List<Turno> turnosLocal)throws Exception {
		try {
			Turno  turnoTemp=null;

			for(Turno turnoAux:turnosLocal) {
				if(turnoAux.getId()!=null && turnoAux.getId().equals(idTurnoSeleccionado)) {
					turnoTemp=turnoAux;
					break;
				}
			}

			jComboBoxTurno.setSelectedItem(turnoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTurnoGenerico(JComboBox jComboBoxTurno,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTurno.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTurno.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTurno.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTurno.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			turno=(Turno) turnoLogic.getTurnos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			turno =(Turno) turnos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!turno.getIsNew() && !turno.getIsChanged() && !turno.getIsDeleted()) {
				sDescripcion=turno.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=turno.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Turno turnoRow=new Turno();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			turnoRow=(Turno) turnoLogic.getTurnos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			turnoRow=(Turno) turnos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTurno(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTurno.setVisible((this.isVisibilidadCeldaNuevoTurno && this.isPermisoNuevoTurno));			
			this.jButtonDuplicarTurno.setVisible((this.isVisibilidadCeldaDuplicarTurno && this.isPermisoDuplicarTurno));			
			this.jButtonCopiarTurno.setVisible((this.isVisibilidadCeldaCopiarTurno && this.isPermisoCopiarTurno));
			this.jButtonVerFormTurno.setVisible((this.isVisibilidadCeldaVerFormTurno && this.isPermisoVerFormTurno));
			
			this.jButtonAbrirOrderByTurno.setVisible((this.isVisibilidadCeldaOrdenTurno && this.isPermisoOrdenTurno));			
			
			this.jButtonNuevoRelacionesTurno.setVisible((this.isVisibilidadCeldaNuevoRelacionesTurno && this.isPermisoNuevoTurno));			
			this.jButtonNuevoGuardarCambiosTurno.setVisible((this.isVisibilidadCeldaNuevoTurno && this.isPermisoNuevoTurno && this.isPermisoGuardarCambiosTurno));
			
			if(this.jInternalFrameDetalleFormTurno!=null) {
			this.jInternalFrameDetalleFormTurno.jButtonModificarTurno.setVisible((this.isVisibilidadCeldaModificarTurno && this.isPermisoActualizarTurno));	
			this.jInternalFrameDetalleFormTurno.jButtonActualizarTurno.setVisible((this.isVisibilidadCeldaActualizarTurno && this.isPermisoActualizarTurno));	
			this.jInternalFrameDetalleFormTurno.jButtonEliminarTurno.setVisible((this.isVisibilidadCeldaEliminarTurno && this.isPermisoEliminarTurno));
			this.jInternalFrameDetalleFormTurno.jButtonCancelarTurno.setVisible(this.isVisibilidadCeldaCancelarTurno);							
			this.jInternalFrameDetalleFormTurno.jButtonGuardarCambiosTurno.setVisible((this.isVisibilidadCeldaGuardarTurno && this.isPermisoGuardarCambiosTurno));			
			
			}
						
			this.jButtonGuardarCambiosTablaTurno.setVisible((this.isVisibilidadCeldaGuardarCambiosTurno && this.isPermisoGuardarCambiosTurno));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTurno.setVisible((this.isVisibilidadCeldaNuevoTurno && this.isPermisoNuevoTurno));						
			this.jButtonDuplicarToolBarTurno.setVisible((this.isVisibilidadCeldaDuplicarTurno && this.isPermisoDuplicarTurno));						
			this.jButtonCopiarToolBarTurno.setVisible((this.isVisibilidadCeldaCopiarTurno && this.isPermisoCopiarTurno));			
			this.jButtonVerFormToolBarTurno.setVisible((this.isVisibilidadCeldaVerFormTurno && this.isPermisoVerFormTurno));			
			this.jButtonAbrirOrderByToolBarTurno.setVisible((this.isVisibilidadCeldaOrdenTurno && this.isPermisoOrdenTurno));
			this.jButtonNuevoRelacionesToolBarTurno.setVisible((this.isVisibilidadCeldaNuevoRelacionesTurno && this.isPermisoNuevoTurno));			
			this.jButtonNuevoGuardarCambiosToolBarTurno.setVisible((this.isVisibilidadCeldaNuevoTurno && this.isPermisoNuevoTurno && this.isPermisoGuardarCambiosTurno));			
			
			if(this.jInternalFrameDetalleFormTurno!=null) {
			this.jInternalFrameDetalleFormTurno.jButtonModificarToolBarTurno.setVisible((this.isVisibilidadCeldaModificarTurno && this.isPermisoActualizarTurno));	
			this.jInternalFrameDetalleFormTurno.jButtonActualizarToolBarTurno.setVisible((this.isVisibilidadCeldaActualizarTurno  && this.isPermisoActualizarTurno));	
			this.jInternalFrameDetalleFormTurno.jButtonEliminarToolBarTurno.setVisible((this.isVisibilidadCeldaEliminarTurno && this.isPermisoEliminarTurno));
			this.jInternalFrameDetalleFormTurno.jButtonCancelarToolBarTurno.setVisible(this.isVisibilidadCeldaCancelarTurno);				
			this.jInternalFrameDetalleFormTurno.jButtonGuardarCambiosToolBarTurno.setVisible((this.isVisibilidadCeldaGuardarTurno && this.isPermisoGuardarCambiosTurno));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTurno.setVisible((this.isVisibilidadCeldaGuardarCambiosTurno && this.isPermisoGuardarCambiosTurno));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTurno.setVisible((this.isVisibilidadCeldaNuevoTurno && this.isPermisoNuevoTurno));			
			this.jMenuItemDuplicarTurno.setVisible((this.isVisibilidadCeldaDuplicarTurno && this.isPermisoDuplicarTurno));			
			this.jMenuItemCopiarTurno.setVisible((this.isVisibilidadCeldaCopiarTurno && this.isPermisoCopiarTurno));			
			this.jMenuItemVerFormTurno.setVisible((this.isVisibilidadCeldaVerFormTurno && this.isPermisoVerFormTurno));			
			this.jMenuItemAbrirOrderByTurno.setVisible((this.isVisibilidadCeldaOrdenTurno && this.isPermisoOrdenTurno));			
			//this.jMenuItemMostrarOcultarTurno.setVisible((this.isVisibilidadCeldaOrdenTurno && this.isPermisoOrdenTurno));
			this.jMenuItemDetalleAbrirOrderByTurno.setVisible((this.isVisibilidadCeldaOrdenTurno && this.isPermisoOrdenTurno));			
			//this.jMenuItemDetalleMostrarOcultarTurno.setVisible((this.isVisibilidadCeldaOrdenTurno && this.isPermisoOrdenTurno));			
			this.jMenuItemNuevoRelacionesTurno.setVisible((this.isVisibilidadCeldaNuevoRelacionesTurno && this.isPermisoNuevoTurno));			
			this.jMenuItemNuevoGuardarCambiosTurno.setVisible((this.isVisibilidadCeldaNuevoTurno && this.isPermisoNuevoTurno && this.isPermisoGuardarCambiosTurno));									
			
			if(this.jInternalFrameDetalleFormTurno!=null) {
			this.jInternalFrameDetalleFormTurno.jMenuItemModificarTurno.setVisible((this.isVisibilidadCeldaModificarTurno && this.isPermisoActualizarTurno));	
			this.jInternalFrameDetalleFormTurno.jMenuItemActualizarTurno.setVisible((this.isVisibilidadCeldaActualizarTurno && this.isPermisoActualizarTurno));	
			this.jInternalFrameDetalleFormTurno.jMenuItemEliminarTurno.setVisible((this.isVisibilidadCeldaEliminarTurno && this.isPermisoEliminarTurno));
			this.jInternalFrameDetalleFormTurno.jMenuItemCancelarTurno.setVisible(this.isVisibilidadCeldaCancelarTurno);				
			}
			
			this.jMenuItemGuardarCambiosTurno.setVisible((this.isVisibilidadCeldaGuardarTurno && this.isPermisoGuardarCambiosTurno));						
			this.jMenuItemGuardarCambiosTablaTurno.setVisible((this.isVisibilidadCeldaGuardarCambiosTurno && this.isPermisoGuardarCambiosTurno));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTurno=this.jButtonNuevoTurno.isVisible();
			this.isVisibilidadCeldaDuplicarTurno=this.jButtonDuplicarTurno.isVisible();
			this.isVisibilidadCeldaCopiarTurno=this.jButtonCopiarTurno.isVisible();
			this.isVisibilidadCeldaVerFormTurno=this.jButtonVerFormTurno.isVisible();
			
			this.isVisibilidadCeldaOrdenTurno=this.jButtonAbrirOrderByTurno.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTurno=this.jButtonNuevoRelacionesTurno.isVisible();
			this.isVisibilidadCeldaModificarTurno=this.jButtonModificarTurno.isVisible();
			
			if(this.jInternalFrameDetalleFormTurno!=null) {
			this.isVisibilidadCeldaActualizarTurno=this.jInternalFrameDetalleFormTurno.jButtonActualizarTurno.isVisible();
			this.isVisibilidadCeldaEliminarTurno=this.jInternalFrameDetalleFormTurno.jButtonEliminarTurno.isVisible();
			this.isVisibilidadCeldaCancelarTurno=this.jInternalFrameDetalleFormTurno.jButtonCancelarTurno.isVisible();
			this.isVisibilidadCeldaGuardarTurno=this.jInternalFrameDetalleFormTurno.jButtonGuardarCambiosTurno.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTurno=this.jButtonGuardarCambiosTablaTurno.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTurno=this.jButtonNuevoToolBarTurno.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTurno=this.jButtonNuevoRelacionesToolBarTurno.isVisible();
			
			if(this.jInternalFrameDetalleFormTurno!=null) {
			this.isVisibilidadCeldaModificarTurno=this.jInternalFrameDetalleFormTurno.jButtonModificarToolBarTurno.isVisible();
			this.isVisibilidadCeldaActualizarTurno=this.jInternalFrameDetalleFormTurno.jButtonActualizarToolBarTurno.isVisible();
			this.isVisibilidadCeldaEliminarTurno=this.jInternalFrameDetalleFormTurno.jButtonEliminarToolBarTurno.isVisible();
			this.isVisibilidadCeldaCancelarTurno=this.jInternalFrameDetalleFormTurno.jButtonCancelarToolBarTurno.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTurno=this.jButtonGuardarCambiosToolBarTurno.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTurno=this.jButtonGuardarCambiosTablaToolBarTurno.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTurno=this.jMenuItemNuevoTurno.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTurno=this.jMenuItemNuevoRelacionesTurno.isVisible();
			
			if(this.jInternalFrameDetalleFormTurno!=null) {
			this.isVisibilidadCeldaModificarTurno=this.jInternalFrameDetalleFormTurno.jMenuItemModificarTurno.isVisible();
			this.isVisibilidadCeldaActualizarTurno=this.jInternalFrameDetalleFormTurno.jMenuItemActualizarTurno.isVisible();
			this.isVisibilidadCeldaEliminarTurno=this.jInternalFrameDetalleFormTurno.jMenuItemEliminarTurno.isVisible();
			this.isVisibilidadCeldaCancelarTurno=this.jInternalFrameDetalleFormTurno.jMenuItemCancelarTurno.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTurno=this.jMenuItemGuardarCambiosTurno.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTurno=this.jMenuItemGuardarCambiosTablaTurno.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTurno(Boolean esInicializar) {
		if(TurnoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.turnoSessionBean.getConGuardarRelaciones()) {
				//if(this.turnoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTurno();
			}
			
			this.inicializarActualizarBindingBotonesManualTurno(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTurno() {
		this.jButtonNuevoTurno.setVisible(this.isPermisoNuevoTurno);			
		this.jButtonDuplicarTurno.setVisible(this.isPermisoDuplicarTurno);			
		this.jButtonCopiarTurno.setVisible(this.isPermisoCopiarTurno);			
		this.jButtonVerFormTurno.setVisible(this.isPermisoVerFormTurno);			
		
		this.jButtonAbrirOrderByTurno.setVisible(this.isPermisoOrdenTurno);					
		
		this.jButtonNuevoRelacionesTurno.setVisible(this.isPermisoNuevoTurno);			
		
		if(this.jInternalFrameDetalleFormTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurno.jButtonModificarTurno.setVisible(this.isPermisoActualizarTurno);	
			this.jInternalFrameDetalleFormTurno.jButtonActualizarTurno.setVisible(this.isPermisoActualizarTurno);	
			this.jInternalFrameDetalleFormTurno.jButtonEliminarTurno.setVisible(this.isPermisoEliminarTurno);
			this.jInternalFrameDetalleFormTurno.jButtonCancelarTurno.setVisible(this.isVisibilidadCeldaCancelarTurno);						
			this.jInternalFrameDetalleFormTurno.jButtonGuardarCambiosTurno.setVisible(this.isPermisoGuardarCambiosTurno);							
		}
		
		this.jButtonGuardarCambiosTablaTurno.setVisible(this.isPermisoActualizarTurno);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTurno() {
		this.jInternalFrameDetalleFormTurno.jButtonModificarTurno.setVisible(this.isPermisoActualizarTurno);	
		this.jInternalFrameDetalleFormTurno.jButtonActualizarTurno.setVisible(this.isPermisoActualizarTurno);	
		this.jInternalFrameDetalleFormTurno.jButtonEliminarTurno.setVisible(this.isPermisoEliminarTurno);
		this.jInternalFrameDetalleFormTurno.jButtonCancelarTurno.setVisible(this.isVisibilidadCeldaCancelarTurno);							
		this.jInternalFrameDetalleFormTurno.jButtonGuardarCambiosTurno.setVisible((this.isVisibilidadCeldaGuardarTurno && this.isPermisoGuardarCambiosTurno));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTurno() {
		if(TurnoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTurno();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTurno() {
	}
	
	public void jTableDatosTurnoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTurno(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTurno(this.getturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.turno==null) {
						this.turno = new Turno();
					}

					this.setVariablesFormularioToObjetoActualTurno(this.turno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
				}

				if(this.turno.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.turno.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTurnoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTurno(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurno.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTurno.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTurno.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTurno(this.getturno(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.turnoLogic.getConnexion());

				if(this.turno.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.turno.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTurno=(TitledBorder)this.jScrollPanelDatosTurno.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTurno.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTurno(this.getturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.turno==null) {
						this.turno = new Turno();
					}

					this.setVariablesFormularioToObjetoActualTurno(this.turno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
				}

				if(this.turno.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.turno.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhora_entradaTurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTurno(this.getturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.turno==null) {
						this.turno = new Turno();
					}

					this.setVariablesFormularioToObjetoActualTurno(this.turno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
				}

				if(this.turno.gethora_entrada()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora_entrada = "+this.turno.gethora_entrada().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhora_salidaTurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTurno(this.getturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.turno==null) {
						this.turno = new Turno();
					}

					this.setVariablesFormularioToObjetoActualTurno(this.turno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
				}

				if(this.turno.gethora_salida()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora_salida = "+this.turno.gethora_salida().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhora_ingreso_recesoTurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTurno(this.getturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.turno==null) {
						this.turno = new Turno();
					}

					this.setVariablesFormularioToObjetoActualTurno(this.turno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
				}

				if(this.turno.gethora_ingreso_receso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora_ingreso_receso = "+this.turno.gethora_ingreso_receso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhora_salida_recesoTurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTurno(this.getturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.turno==null) {
						this.turno = new Turno();
					}

					this.setVariablesFormularioToObjetoActualTurno(this.turno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
				}

				if(this.turno.gethora_salida_receso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora_salida_receso = "+this.turno.gethora_salida_receso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhora_durante_recesoTurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTurno(this.getturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.turno==null) {
						this.turno = new Turno();
					}

					this.setVariablesFormularioToObjetoActualTurno(this.turno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
				}

				if(this.turno.gethora_durante_receso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora_durante_receso = "+this.turno.gethora_durante_receso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhora_ingreso_almuerzoTurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTurno(this.getturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.turno==null) {
						this.turno = new Turno();
					}

					this.setVariablesFormularioToObjetoActualTurno(this.turno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
				}

				if(this.turno.gethora_ingreso_almuerzo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora_ingreso_almuerzo = "+this.turno.gethora_ingreso_almuerzo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhora_salida_almuerzoTurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTurno(this.getturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.turno==null) {
						this.turno = new Turno();
					}

					this.setVariablesFormularioToObjetoActualTurno(this.turno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
				}

				if(this.turno.gethora_salida_almuerzo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora_salida_almuerzo = "+this.turno.gethora_salida_almuerzo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhora_durante_almuerzoTurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTurno(this.getturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.turno==null) {
						this.turno = new Turno();
					}

					this.setVariablesFormularioToObjetoActualTurno(this.turno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
				}

				if(this.turno.gethora_durante_almuerzo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora_durante_almuerzo = "+this.turno.gethora_durante_almuerzo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhora_ingreso25TurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTurno(this.getturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.turno==null) {
						this.turno = new Turno();
					}

					this.setVariablesFormularioToObjetoActualTurno(this.turno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
				}

				if(this.turno.gethora_ingreso25()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora_ingreso25 = "+this.turno.gethora_ingreso25().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhora_salida25TurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTurno(this.getturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.turno==null) {
						this.turno = new Turno();
					}

					this.setVariablesFormularioToObjetoActualTurno(this.turno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
				}

				if(this.turno.gethora_salida25()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora_salida25 = "+this.turno.gethora_salida25().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhora_ingreso50TurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTurno(this.getturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.turno==null) {
						this.turno = new Turno();
					}

					this.setVariablesFormularioToObjetoActualTurno(this.turno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
				}

				if(this.turno.gethora_ingreso50()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora_ingreso50 = "+this.turno.gethora_ingreso50().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhora_salida50TurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTurno(this.getturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.turno==null) {
						this.turno = new Turno();
					}

					this.setVariablesFormularioToObjetoActualTurno(this.turno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
				}

				if(this.turno.gethora_salida50()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora_salida50 = "+this.turno.gethora_salida50().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhora_ingreso100TurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTurno(this.getturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.turno==null) {
						this.turno = new Turno();
					}

					this.setVariablesFormularioToObjetoActualTurno(this.turno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
				}

				if(this.turno.gethora_ingreso100()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora_ingreso100 = "+this.turno.gethora_ingreso100().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhora_salida100TurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTurno(this.getturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.turno==null) {
						this.turno = new Turno();
					}

					this.setVariablesFormularioToObjetoActualTurno(this.turno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
				}

				if(this.turno.gethora_salida100()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora_salida100 = "+this.turno.gethora_salida100().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhora_ingreso200TurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTurno(this.getturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.turno==null) {
						this.turno = new Turno();
					}

					this.setVariablesFormularioToObjetoActualTurno(this.turno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
				}

				if(this.turno.gethora_ingreso200()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora_ingreso200 = "+this.turno.gethora_ingreso200().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhora_salida200TurnoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTurno.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTurno(this.getturno(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.turno==null) {
						this.turno = new Turno();
					}

					this.setVariablesFormularioToObjetoActualTurno(this.turno,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);
				}

				if(this.turno.gethora_salida200()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora_salida200 = "+this.turno.gethora_salida200().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTurno(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTurnoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTurno(false,false);

			this.getTurnosFK_IdEmpresa();

			this.inicializarActualizarBindingTurno(false);

			//if(TurnoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTurno(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.turnoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTurno() {
		if(this.jInternalFrameDetalleFormTurno!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTurno!=null) {
			this.jInternalFrameDetalleFormTurno.setVisible(false);	    			
			this.jInternalFrameDetalleFormTurno.dispose();
			this.jInternalFrameDetalleFormTurno=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTurno!=null) {
			this.jInternalFrameReporteDinamicoTurno.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTurno.dispose();
			this.jInternalFrameReporteDinamicoTurno=null;
		}
		
		if(this.jInternalFrameImportacionTurno!=null) {
			this.jInternalFrameImportacionTurno.setVisible(false);	    			
			this.jInternalFrameImportacionTurno.dispose();
			this.jInternalFrameImportacionTurno=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTurno();
			
			TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTurno")) {
				jButtonNuevoTurnoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTurno")) {
				jButtonDuplicarTurnoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTurno")) {
				jButtonCopiarTurnoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTurno")) {
				jButtonVerFormTurnoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTurno")) {
				jButtonNuevoTurnoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTurno")) {
				jButtonDuplicarTurnoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTurno")) {
				jButtonNuevoTurnoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTurno")) {
				jButtonDuplicarTurnoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTurno")) {
				jButtonNuevoTurnoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTurno")) {
				jButtonNuevoTurnoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTurno")) {
				jButtonNuevoTurnoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTurno")) {
				jButtonModificarTurnoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTurno")) {
				jButtonModificarTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTurno")) {
				jButtonModificarTurnoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTurno")) {
				jButtonActualizarTurnoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTurno")) {
				jButtonActualizarTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTurno")) {
				jButtonActualizarTurnoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTurno")) {
				jButtonEliminarTurnoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTurno")) {
				jButtonEliminarTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTurno")) {
				jButtonEliminarTurnoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTurno")) {
				jButtonCancelarTurnoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTurno")) {
				jButtonCancelarTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTurno")) {
				jButtonCancelarTurnoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTurno")) {
				jButtonCerrarTurnoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTurno")) {
				jButtonCerrarTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTurno")) {
				jButtonCerrarTurnoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTurno")) {
				jButtonMostrarOcultarTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTurno")) {
				jButtonCancelarTurnoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTurno")) {
				jButtonGuardarCambiosTurnoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTurno")) {
				jButtonGuardarCambiosTurnoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTurno")) {
				jButtonCopiarTurnoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTurno")) {
				jButtonVerFormTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTurno")) {
				jButtonGuardarCambiosTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTurno")) {
				jButtonCopiarTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTurno")) {
				jButtonVerFormTurnoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTurno")) {
				jButtonGuardarCambiosTurnoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTurno")) {
				jButtonGuardarCambiosTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTurno")) {
				jButtonGuardarCambiosTurnoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTurno")) {
				jButtonRecargarInformacionTurnoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTurno")) {
				jButtonRecargarInformacionTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTurno")) {
				jButtonRecargarInformacionTurnoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTurno")) {
				jButtonAnterioresTurnoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTurno")) {
				jButtonAnterioresTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTurno")) {
				jButtonAnterioresTurnoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTurno")) {
				jButtonSiguientesTurnoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTurno")) {
				jButtonSiguientesTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTurno")) {
				jButtonSiguientesTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTurno") || sTipo.equals("MenuItemDetalleAbrirOrderByTurno")) {
				jButtonAbrirOrderByTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTurno") || sTipo.equals("MenuItemDetalleMostrarOcultarTurno")) {
				jButtonMostrarOcultarTurnoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTurno")) {
				jButtonNuevoGuardarCambiosTurnoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTurno")) {
				jButtonNuevoGuardarCambiosTurnoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTurno")) {
				jButtonNuevoGuardarCambiosTurnoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTurno")) {
				jButtonCerrarReporteDinamicoTurnoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTurno")) {
				jButtonGenerarReporteDinamicoTurnoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTurno")) {
				
				jButtonGenerarExcelReporteDinamicoTurnoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTurno")) {
				jButtonCerrarImportacionTurnoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTurno")) {
				
				jButtonGenerarImportacionTurnoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTurno")) {
				
				jButtonAbrirImportacionTurnoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTurno")) {
				jComboBoxTiposAccionesTurnoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTurno")) {
				jComboBoxTiposRelacionesTurnoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTurno")) {
				jComboBoxTiposAccionesTurnoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTurno")) {
				
				jComboBoxTiposSeleccionarTurnoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTurno")) {
				jTextFieldValorCampoGeneralTurnoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTurno")) {
				jButtonAbrirOrderByTurnoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTurno")) {
				jButtonAbrirOrderByTurnoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTurno")) {
				jButtonCerrarOrderByTurnoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTurnoBusqueda")) {
				this.jButtonidTurnoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTurnoUpdate")) {
				this.jButtonid_empresaTurnoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTurnoBusqueda")) {
				this.jButtonid_empresaTurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_entradaTurnoBusqueda")) {
				this.jButtonhora_entradaTurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_salidaTurnoBusqueda")) {
				this.jButtonhora_salidaTurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_ingreso_recesoTurnoBusqueda")) {
				this.jButtonhora_ingreso_recesoTurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_salida_recesoTurnoBusqueda")) {
				this.jButtonhora_salida_recesoTurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_durante_recesoTurnoBusqueda")) {
				this.jButtonhora_durante_recesoTurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_ingreso_almuerzoTurnoBusqueda")) {
				this.jButtonhora_ingreso_almuerzoTurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_salida_almuerzoTurnoBusqueda")) {
				this.jButtonhora_salida_almuerzoTurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_durante_almuerzoTurnoBusqueda")) {
				this.jButtonhora_durante_almuerzoTurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_ingreso25TurnoBusqueda")) {
				this.jButtonhora_ingreso25TurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_salida25TurnoBusqueda")) {
				this.jButtonhora_salida25TurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_ingreso50TurnoBusqueda")) {
				this.jButtonhora_ingreso50TurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_salida50TurnoBusqueda")) {
				this.jButtonhora_salida50TurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_ingreso100TurnoBusqueda")) {
				this.jButtonhora_ingreso100TurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_salida100TurnoBusqueda")) {
				this.jButtonhora_salida100TurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_ingreso200TurnoBusqueda")) {
				this.jButtonhora_ingreso200TurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_salida200TurnoBusqueda")) {
				this.jButtonhora_salida200TurnoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTurno();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTurnoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.turno);
				
				this.actualizarInformacion("INFO_PADRE",false,this.turno);
				
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
				
				


				
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Turno.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Turno.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Turno turnoLocal=null;
			
			if(!this.getEsControlTabla()) {
				turnoLocal=this.turno;
			} else {
				turnoLocal=this.turnoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.turno);
				
				this.actualizarInformacion("INFO_PADRE",false,this.turno);
				
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
							
				
				


				
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Turno.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Turno.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTurnoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTurno.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoAnterior =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.turnoAnterior =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
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
			
			TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
			
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
			
			


			
			TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTurnoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.turno);
				
				this.actualizarInformacion("INFO_PADRE",false,this.turno);
				
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
								
						
				


				
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Turno.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Turno.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.turno);
				
				this.actualizarInformacion("INFO_PADRE",false,this.turno);
				
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
								
				
				


				
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Turno.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Turno.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTurnoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTurno.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoAnterior =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.turnoAnterior =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.turno);
				
				this.actualizarInformacion("INFO_PADRE",false,this.turno);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTurnoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTurno.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoAnterior =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.turnoAnterior =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTurnoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.turno);
			
			this.actualizarInformacion("INFO_PADRE",false,this.turno);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.turno);
				
				this.actualizarInformacion("INFO_PADRE",false,this.turno);
				
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
							
				
				


				
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Turno.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Turno.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTurnoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTurno.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turnoAnterior =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.turnoAnterior =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
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
			
			TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
			
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
			
			


			
			TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTurnoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.turno);
			
			this.actualizarInformacion("INFO_PADRE",false,this.turno);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.turno);
				
				this.actualizarInformacion("INFO_PADRE",false,this.turno);
				
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
								
				
				


				
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Turno.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Turno.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTurnoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTurno.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoAnterior =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.turnoAnterior =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTurnoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.turno);
			
			this.actualizarInformacion("INFO_PADRE",false,this.turno);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTurnoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.turno);
				
				this.actualizarInformacion("INFO_PADRE",false,this.turno);
				
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTurno")) {
					jCheckBoxSeleccionarTodosTurnoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTurno")) {
					jCheckBoxSeleccionadosTurnoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTurno")) {
					
				}
				
				


				
				
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Turno.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Turno.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.turno);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.turno);
				
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
												
				
				


				
				
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Turno.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Turno.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTurnoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTurno.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.turnoAnterior =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.turnoAnterior =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTurnoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.turno);
				
				this.actualizarInformacion("INFO_PADRE",false,this.turno);
				
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
				
				
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
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
			
			TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
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
			
			


			
			TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTurnoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.turno);
				
				this.actualizarInformacion("INFO_PADRE",false,this.turno);
				
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Turno.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Turno.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.turno);
				
				this.actualizarInformacion("INFO_PADRE",false,this.turno);
				
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
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
				
				


				
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Turno.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Turno.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTurnoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTurno.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.turnoAnterior =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.turnoAnterior =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTurno")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTurnoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTurno.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.turno =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.turno =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.turno);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTurno")) {
				
				}
				
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTurno")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTurno.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTurno")) {
			
			}
			
			TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTurno();
			
			TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
			
			if(sTipo.equals("NuevoTurno")) {
				jButtonNuevoTurnoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTurno")) {
				jButtonDuplicarTurnoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTurno")) {
				jButtonCopiarTurnoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTurno")) {
				jButtonVerFormTurnoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTurno")) {
				jButtonNuevoTurnoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTurno")) {
				jButtonModificarTurnoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTurno")) {
				jButtonActualizarTurnoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTurno")) {
				jButtonEliminarTurnoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTurno")) {
				jButtonGuardarCambiosTurnoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTurno")) {
				jButtonCancelarTurnoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTurno")) {
				jButtonCerrarTurnoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTurno")) {
				jButtonGuardarCambiosTurnoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTurno")) {
				jButtonNuevoGuardarCambiosTurnoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTurno")) {
				jButtonAbrirOrderByTurnoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTurno")) {
				jButtonRecargarInformacionTurnoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTurno")) {
				jButtonAnterioresTurnoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTurno")) {
				jButtonSiguientesTurnoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTurnoBusqueda")) {
				this.jButtonidTurnoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTurnoUpdate")) {
				this.jButtonid_empresaTurnoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTurnoBusqueda")) {
				this.jButtonid_empresaTurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_entradaTurnoBusqueda")) {
				this.jButtonhora_entradaTurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_salidaTurnoBusqueda")) {
				this.jButtonhora_salidaTurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_ingreso_recesoTurnoBusqueda")) {
				this.jButtonhora_ingreso_recesoTurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_salida_recesoTurnoBusqueda")) {
				this.jButtonhora_salida_recesoTurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_durante_recesoTurnoBusqueda")) {
				this.jButtonhora_durante_recesoTurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_ingreso_almuerzoTurnoBusqueda")) {
				this.jButtonhora_ingreso_almuerzoTurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_salida_almuerzoTurnoBusqueda")) {
				this.jButtonhora_salida_almuerzoTurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_durante_almuerzoTurnoBusqueda")) {
				this.jButtonhora_durante_almuerzoTurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_ingreso25TurnoBusqueda")) {
				this.jButtonhora_ingreso25TurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_salida25TurnoBusqueda")) {
				this.jButtonhora_salida25TurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_ingreso50TurnoBusqueda")) {
				this.jButtonhora_ingreso50TurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_salida50TurnoBusqueda")) {
				this.jButtonhora_salida50TurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_ingreso100TurnoBusqueda")) {
				this.jButtonhora_ingreso100TurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_salida100TurnoBusqueda")) {
				this.jButtonhora_salida100TurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_ingreso200TurnoBusqueda")) {
				this.jButtonhora_ingreso200TurnoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_salida200TurnoBusqueda")) {
				this.jButtonhora_salida200TurnoBusquedaActionPerformed(evt);
			}
			
			TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTurno();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTurno")) {
				closingInternalFrameTurno();
				
			} else if(sTipo.equals("jButtonCancelarTurno")) {
				JInternalFrameBase jInternalFrameDetalleFormTurno = (JInternalFrameBase)evt.getSource();
	            	
	            TurnoBeanSwingJInternalFrame jInternalFrameParent=(TurnoBeanSwingJInternalFrame)jInternalFrameDetalleFormTurno.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTurnoActionPerformed(null);
			}
			
			TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.turno,new Object(),this.turnoParameterGeneral,this.turnoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTurno(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTurno(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTurno(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.turno)) {
			if(!esControlTabla) {
				if(TurnoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTurno(this.turno,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);			
				}
				
				if(this.turnoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTurno(this.turno,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.turnoReturnGeneral=turnoLogic.procesarEventosTurnosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.turnoLogic.getTurnos(),this.turno,this.turnoParameterGeneral,this.isEsNuevoTurno,classes);//this.turnoLogic.getTurno()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTurno(this.turnoReturnGeneral,this.turnoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.turnoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTurno(classes,this.turnoReturnGeneral,this.turnoBean,false);
					}
						
					if(this.turnoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTurno(this.turnoReturnGeneral.getTurno());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTurno(this.turnoReturnGeneral.getTurno());	
					}
						
					if(this.turnoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTurno(this.turnoReturnGeneral.getTurno(),classes);//this.turnoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTurno(this.turno,classes);//this.turnoBean);									
				}
			
				if(TurnoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTurno(this.turno,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTurno(this.turno);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.turnoAnterior!=null) {
						this.turno=this.turnoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.turnoReturnGeneral=turnoLogic.procesarEventosTurnosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.turnoLogic.getTurnos(),this.turno,this.turnoParameterGeneral,this.isEsNuevoTurno,classes);//this.turnoLogic.getTurno()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.turnoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.turnoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.turnoReturnGeneral.getTurno(),turnoLogic.getTurnos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.turnoReturnGeneral.getTurno(),this.turnos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTurno.repaint();
				
				//((AbstractTableModel) this.jTableDatosTurno.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTurno();
			}
		}
	}
	
	public void actualizarVisualTableDatosTurno() throws Exception {
		
		TurnoModel turnoModel=(TurnoModel)this.jTableDatosTurno.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			turnoModel.turnos=this.turnoLogic.getTurnos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			turnoModel.turnos=this.turnos;
		}
		
		
		((TurnoModel) this.jTableDatosTurno.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTurno() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getturnoAnterior(),this.turnoLogic.getTurnos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getturnoAnterior(),this.turnos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTurno();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTurno(Turno turno,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
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
										
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.turno,new Object(),generalEntityParameterGeneral,this.turnoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.turnoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TurnoConstantesFunciones.getClassesRelationshipsOfTurno(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TurnoConstantesFunciones.getClassesRelationshipsFromStringsOfTurno(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTurno(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TurnoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.turno,new Object(),generalEntityParameterGeneral,this.turnoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTurno(TurnoBean turnoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTurno(ArrayList<Classe> classes,TurnoReturnGeneral turnoReturnGeneral,TurnoBean turnoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTurno(Turno turno,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.turno)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTurno = new TurnoDetalleFormJInternalFrame(jDesktopPane,this.turnoSessionBean.getConGuardarRelaciones(),this.turnoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTurno);
		this.jInternalFrameDetalleFormTurno.setVisible(false);
		this.jInternalFrameDetalleFormTurno.setSelected(false);						
		
		this.jInternalFrameDetalleFormTurno.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTurno.turnoLogic=this.turnoLogic;
		
		this.cargarCombosFrameForeignKeyTurno("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTurno();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTurno();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTurno("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTurno();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTurno.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTurno"));
		
		this.jInternalFrameDetalleFormTurno.jButtonModificarTurno.addActionListener(new ButtonActionListener(this,"ModificarTurno"));

		
		this.jInternalFrameDetalleFormTurno.jButtonModificarToolBarTurno.addActionListener(new ButtonActionListener(this,"ModificarToolBarTurno"));
					
		this.jInternalFrameDetalleFormTurno.jMenuItemModificarTurno.addActionListener(new ButtonActionListener(this,"MenuItemModificarTurno"));		
		
		
		
		this.jInternalFrameDetalleFormTurno.jButtonActualizarTurno.addActionListener (new ButtonActionListener(this,"ActualizarTurno"));
		
		
		this.jInternalFrameDetalleFormTurno.jButtonActualizarToolBarTurno.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTurno"));
						
		this.jInternalFrameDetalleFormTurno.jMenuItemActualizarTurno.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTurno"));		
		
		
		
		this.jInternalFrameDetalleFormTurno.jButtonEliminarTurno.addActionListener (new ButtonActionListener(this,"EliminarTurno"));
		
		
		this.jInternalFrameDetalleFormTurno.jButtonEliminarToolBarTurno.addActionListener (new ButtonActionListener(this,"EliminarToolBarTurno"));
								
		this.jInternalFrameDetalleFormTurno.jMenuItemEliminarTurno.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTurno"));		
		
		
		
		this.jInternalFrameDetalleFormTurno.jButtonCancelarTurno.addActionListener (new ButtonActionListener(this,"CancelarTurno"));
		
		
		this.jInternalFrameDetalleFormTurno.jButtonCancelarToolBarTurno.addActionListener (new ButtonActionListener(this,"CancelarToolBarTurno"));
					
		this.jInternalFrameDetalleFormTurno.jMenuItemCancelarTurno.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTurno"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTurno.jMenuItemDetalleCerrarTurno.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTurno"));		
		
		
		
		this.jInternalFrameDetalleFormTurno.jButtonGuardarCambiosToolBarTurno.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTurno"));
		
		
		
		this.jInternalFrameDetalleFormTurno.jButtonGuardarCambiosToolBarTurno.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTurno"));
		
		
		
		this.jInternalFrameDetalleFormTurno.jComboBoxTiposAccionesFormularioTurno.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTurno"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonidTurnoBusqueda.addActionListener(new ButtonActionListener(this,"idTurnoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTurno.jButtonid_empresaTurnoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTurnoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonid_empresaTurnoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_entradaTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_entradaTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_salidaTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_salidaTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_ingreso_recesoTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_ingreso_recesoTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_salida_recesoTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_salida_recesoTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_durante_recesoTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_durante_recesoTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_ingreso_almuerzoTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_ingreso_almuerzoTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_salida_almuerzoTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_salida_almuerzoTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_durante_almuerzoTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_durante_almuerzoTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_ingreso25TurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_ingreso25TurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_salida25TurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_salida25TurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_ingreso50TurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_ingreso50TurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_salida50TurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_salida50TurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_ingreso100TurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_ingreso100TurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_salida100TurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_salida100TurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_ingreso200TurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_ingreso200TurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_salida200TurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_salida200TurnoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTurno.jTabbedPaneRelacionesTurno.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTurno"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTurno"));
		
		if(this.jInternalFrameDetalleFormTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurno.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTurno"));
		}
		
		this.jTableDatosTurno.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTurno"));
		
		this.jTableDatosTurno.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTurno"));
		
		this.jButtonNuevoTurno.addActionListener(new ButtonActionListener(this,"NuevoTurno"));
		
		this.jButtonDuplicarTurno.addActionListener(new ButtonActionListener(this,"DuplicarTurno"));
		
		this.jButtonCopiarTurno.addActionListener(new ButtonActionListener(this,"CopiarTurno"));
		
		this.jButtonVerFormTurno.addActionListener(new ButtonActionListener(this,"VerFormTurno"));
		
		
		this.jButtonNuevoToolBarTurno.addActionListener(new ButtonActionListener(this,"NuevoToolBarTurno"));
			
		this.jButtonDuplicarToolBarTurno.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTurno"));
			
		this.jMenuItemNuevoTurno.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTurno"));
			
		this.jMenuItemDuplicarTurno.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTurno"));		
		
		
		this.jButtonNuevoRelacionesTurno.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTurno"));
		
		
		this.jButtonNuevoRelacionesToolBarTurno.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTurno"));
			
		this.jMenuItemNuevoRelacionesTurno.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTurno"));		
		
		
		if(this.jInternalFrameDetalleFormTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurno.jButtonModificarTurno.addActionListener(new ButtonActionListener(this,"ModificarTurno"));
		}
		
		
		if(this.jInternalFrameDetalleFormTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurno.jButtonModificarToolBarTurno.addActionListener(new ButtonActionListener(this,"ModificarToolBarTurno"));
			
			this.jInternalFrameDetalleFormTurno.jMenuItemModificarTurno.addActionListener(new ButtonActionListener(this,"MenuItemModificarTurno"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTurno!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTurno.jButtonActualizarTurno.addActionListener (new ButtonActionListener(this,"ActualizarTurno"));
		}
		
		
		if(this.jInternalFrameDetalleFormTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurno.jButtonActualizarToolBarTurno.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTurno"));
				
			this.jInternalFrameDetalleFormTurno.jMenuItemActualizarTurno.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTurno"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurno.jButtonEliminarTurno.addActionListener (new ButtonActionListener(this,"EliminarTurno"));
		}
		
		
		if(this.jInternalFrameDetalleFormTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurno.jButtonEliminarToolBarTurno.addActionListener (new ButtonActionListener(this,"EliminarToolBarTurno"));
						
			this.jInternalFrameDetalleFormTurno.jMenuItemEliminarTurno.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTurno"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurno.jButtonCancelarTurno.addActionListener (new ButtonActionListener(this,"CancelarTurno"));
		}
		
		
		if(this.jInternalFrameDetalleFormTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurno.jButtonCancelarToolBarTurno.addActionListener (new ButtonActionListener(this,"CancelarToolBarTurno"));
			
			this.jInternalFrameDetalleFormTurno.jMenuItemCancelarTurno.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTurno"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTurno.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTurno"));		
		
		
		this.jButtonCerrarTurno.addActionListener (new ButtonActionListener(this,"CerrarTurno"));
		
		
		this.jButtonCerrarToolBarTurno.addActionListener (new ButtonActionListener(this,"CerrarToolBarTurno"));
			
		this.jMenuItemCerrarTurno.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTurno"));
			
		if(this.jInternalFrameDetalleFormTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurno.jMenuItemDetalleCerrarTurno.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTurno"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurno.jButtonGuardarCambiosTurno.addActionListener (new ButtonActionListener(this,"GuardarCambiosTurno"));
		}
		
		
		if(this.jInternalFrameDetalleFormTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurno.jButtonGuardarCambiosToolBarTurno.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTurno"));
		}
		
		this.jButtonCopiarToolBarTurno.addActionListener (new ButtonActionListener(this,"CopiarToolBarTurno"));
			
		this.jButtonVerFormToolBarTurno.addActionListener (new ButtonActionListener(this,"VerFormToolBarTurno"));
		
		this.jMenuItemGuardarCambiosTurno.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTurno"));
			
		this.jMenuItemCopiarTurno.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTurno"));		
		
		this.jMenuItemVerFormTurno.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTurno"));		
		
		
		this.jButtonGuardarCambiosTablaTurno.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTurno"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTurno.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTurno"));
			
		this.jMenuItemGuardarCambiosTablaTurno.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTurno"));		
		
		
		
		this.jButtonRecargarInformacionTurno.addActionListener (new ButtonActionListener(this,"RecargarInformacionTurno"));
					
		this.jButtonRecargarInformacionToolBarTurno.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTurno"));
		
		this.jMenuItemRecargarInformacionTurno.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTurno"));		
		
		
		
		this.jButtonAnterioresTurno.addActionListener (new ButtonActionListener(this,"AnterioresTurno"));
		
		
		this.jButtonAnterioresToolBarTurno.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTurno"));
		
		this.jMenuItemAnterioresTurno.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTurno"));		
		
		
		this.jButtonSiguientesTurno.addActionListener (new ButtonActionListener(this,"SiguientesTurno"));
		
		
		this.jButtonSiguientesToolBarTurno.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTurno"));
			
		this.jMenuItemSiguientesTurno.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTurno"));
			
		this.jMenuItemAbrirOrderByTurno.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTurno"));
			
		this.jMenuItemMostrarOcultarTurno.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTurno"));
			
		this.jMenuItemDetalleAbrirOrderByTurno.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTurno"));
			
		this.jMenuItemDetalleMostarOcultarTurno.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTurno"));		
		
		
		this.jButtonNuevoGuardarCambiosTurno.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTurno"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTurno.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTurno"));
			
		this.jMenuItemNuevoGuardarCambiosTurno.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTurno"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTurno.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTurno"));

		this.jCheckBoxSeleccionadosTurno.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTurno"));
		
		if(this.jInternalFrameDetalleFormTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurno.jComboBoxTiposAccionesFormularioTurno.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTurno"));
		}
		
		
		this.jComboBoxTiposRelacionesTurno.addActionListener (new ButtonActionListener(this,"TiposRelacionesTurno"));
			
		this.jComboBoxTiposAccionesTurno.addActionListener (new ButtonActionListener(this,"TiposAccionesTurno"));
					
		this.jComboBoxTiposSeleccionarTurno.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTurno"));
			
		this.jTextFieldValorCampoGeneralTurno.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTurno"));		
		
		
		if(this.jInternalFrameDetalleFormTurno!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonidTurnoBusqueda.addActionListener(new ButtonActionListener(this,"idTurnoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTurno.jButtonid_empresaTurnoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTurnoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonid_empresaTurnoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_entradaTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_entradaTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_salidaTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_salidaTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_ingreso_recesoTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_ingreso_recesoTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_salida_recesoTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_salida_recesoTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_durante_recesoTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_durante_recesoTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_ingreso_almuerzoTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_ingreso_almuerzoTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_salida_almuerzoTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_salida_almuerzoTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_durante_almuerzoTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_durante_almuerzoTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_ingreso25TurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_ingreso25TurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_salida25TurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_salida25TurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_ingreso50TurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_ingreso50TurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_salida50TurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_salida50TurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_ingreso100TurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_ingreso100TurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_salida100TurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_salida100TurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_ingreso200TurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_ingreso200TurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_salida200TurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_salida200TurnoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTurno!=null) {
				this.jInternalFrameReporteDinamicoTurno.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTurno"));
				this.jInternalFrameReporteDinamicoTurno.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTurno"));
				this.jInternalFrameReporteDinamicoTurno.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTurno"));
			}
			
			//this.jButtonCerrarReporteDinamicoTurno.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTurno"));				
			//this.jButtonGenerarReporteDinamicoTurno.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTurno"));
			//this.jButtonGenerarExcelReporteDinamicoTurno.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTurno"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTurno!=null) {
				this.jInternalFrameImportacionTurno.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTurno"));
				this.jInternalFrameImportacionTurno.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTurno"));
				this.jInternalFrameImportacionTurno.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTurno"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTurno.addActionListener (new ButtonActionListener(this,"AbrirOrderByTurno"));
			
			this.jButtonAbrirOrderByToolBarTurno.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTurno"));			
			
			if(this.jInternalFrameOrderByTurno!=null) {
				this.jInternalFrameOrderByTurno.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTurno"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTurno!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTurno!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTurno.jTabbedPaneRelacionesTurno.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTurno"));
		
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
            		closingInternalFrameTurno();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTurno.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTurno = (JInternalFrameBase)event.getSource();
	            	
	            TurnoBeanSwingJInternalFrame jInternalFrameParent=(TurnoBeanSwingJInternalFrame)jInternalFrameDetalleFormTurno.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTurnoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTurno.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTurnoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTurno.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTurno.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTurnoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTurnoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTurnoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTurno";
		inputMap = this.jButtonNuevoTurno.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTurno.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTurnoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTurnoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTurnoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTurnoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTurno";
		inputMap = this.jButtonNuevoRelacionesTurno.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTurno.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTurnoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTurno";
		inputMap = this.jButtonModificarTurno.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTurno.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTurnoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTurno";
		inputMap = this.jButtonActualizarTurno.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTurno.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTurnoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTurno";
		inputMap = this.jButtonEliminarTurno.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTurno.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTurnoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTurno";
		inputMap = this.jButtonCancelarTurno.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTurno.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTurnoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTurno";
		inputMap = this.jButtonCerrarTurno.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTurno.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTurnoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTurno.jButtonGuardarCambiosTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTurno";
		inputMap = this.jInternalFrameDetalleFormTurno.jButtonGuardarCambiosTurno.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTurno.jButtonGuardarCambiosTurno.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTurnoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTurno.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTurnoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTurno.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTurnoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTurno.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTurnoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTurno.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTurnoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonidTurnoBusqueda.addActionListener(new ButtonActionListener(this,"idTurnoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTurno.jButtonid_empresaTurnoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTurnoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonid_empresaTurnoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_entradaTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_entradaTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_salidaTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_salidaTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_ingreso_recesoTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_ingreso_recesoTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_salida_recesoTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_salida_recesoTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_durante_recesoTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_durante_recesoTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_ingreso_almuerzoTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_ingreso_almuerzoTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_salida_almuerzoTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_salida_almuerzoTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_durante_almuerzoTurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_durante_almuerzoTurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_ingreso25TurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_ingreso25TurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_salida25TurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_salida25TurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_ingreso50TurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_ingreso50TurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_salida50TurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_salida50TurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_ingreso100TurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_ingreso100TurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_salida100TurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_salida100TurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_ingreso200TurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_ingreso200TurnoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTurno.jButtonhora_salida200TurnoBusqueda.addActionListener(new ButtonActionListener(this,"hora_salida200TurnoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTurno.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTurnoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTurnoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTurno.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTurno(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Turno turnoAux:this.turnoLogic.getTurnos()) {
					turnoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Turno turnoAux:turnos) {
					turnoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTurnoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTurno(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Turno turnoAux:this.turnoLogic.getTurnos()) {
						turnoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Turno turnoAux:turnos) {
						turnoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Turno turnoAux:this.turnoLogic.getTurnos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Turno turnoAux:turnos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTurno(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTurno.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTurno.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTurno,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTurnoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTurno(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTurno.getSelectedRows();
			
			Turno turnoLocal=new Turno();
			
			//this.seleccionarTodosTurno(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					turnoLocal =(Turno) this.turnoLogic.getTurnos().toArray()[this.jTableDatosTurno.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					turnoLocal =(Turno) this.turnos.toArray()[this.jTableDatosTurno.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				turnoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Turno turnoAux:this.turnoLogic.getTurnos()) {
						turnoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Turno turnoAux:turnos) {
						turnoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTurno(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTurno.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTurno.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTurno,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTurnoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTurnoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTurnoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTurno(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTurno.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Turno turnoAux:this.turnoLogic.getTurnos()) {
				
						if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORAENTRADA)) {
							existe=true;
							turnoAux.sethora_entrada(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORASALIDA)) {
							existe=true;
							turnoAux.sethora_salida(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORAINGRESORECESO)) {
							existe=true;
							turnoAux.sethora_ingreso_receso(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORASALIDARECESO)) {
							existe=true;
							turnoAux.sethora_salida_receso(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORADURANTERECESO)) {
							existe=true;
							turnoAux.sethora_durante_receso(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORAINGRESOALMUERZO)) {
							existe=true;
							turnoAux.sethora_ingreso_almuerzo(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORASALIDAALMUERZO)) {
							existe=true;
							turnoAux.sethora_salida_almuerzo(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORADURANTEALMUERZO)) {
							existe=true;
							turnoAux.sethora_durante_almuerzo(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORAINGRESO25)) {
							existe=true;
							turnoAux.sethora_ingreso25(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORASALIDA25)) {
							existe=true;
							turnoAux.sethora_salida25(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORAINGRESO50)) {
							existe=true;
							turnoAux.sethora_ingreso50(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORASALIDA50)) {
							existe=true;
							turnoAux.sethora_salida50(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORAINGRESO100)) {
							existe=true;
							turnoAux.sethora_ingreso100(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORASALIDA100)) {
							existe=true;
							turnoAux.sethora_salida100(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORAINGRESO200)) {
							existe=true;
							turnoAux.sethora_ingreso200(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORASALIDA200)) {
							existe=true;
							turnoAux.sethora_salida200(Time.valueOf(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Turno turnoAux:turnos) {
					
						if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORAENTRADA)) {
							existe=true;
							turnoAux.sethora_entrada(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORASALIDA)) {
							existe=true;
							turnoAux.sethora_salida(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORAINGRESORECESO)) {
							existe=true;
							turnoAux.sethora_ingreso_receso(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORASALIDARECESO)) {
							existe=true;
							turnoAux.sethora_salida_receso(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORADURANTERECESO)) {
							existe=true;
							turnoAux.sethora_durante_receso(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORAINGRESOALMUERZO)) {
							existe=true;
							turnoAux.sethora_ingreso_almuerzo(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORASALIDAALMUERZO)) {
							existe=true;
							turnoAux.sethora_salida_almuerzo(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORADURANTEALMUERZO)) {
							existe=true;
							turnoAux.sethora_durante_almuerzo(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORAINGRESO25)) {
							existe=true;
							turnoAux.sethora_ingreso25(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORASALIDA25)) {
							existe=true;
							turnoAux.sethora_salida25(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORAINGRESO50)) {
							existe=true;
							turnoAux.sethora_ingreso50(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORASALIDA50)) {
							existe=true;
							turnoAux.sethora_salida50(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORAINGRESO100)) {
							existe=true;
							turnoAux.sethora_ingreso100(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORASALIDA100)) {
							existe=true;
							turnoAux.sethora_salida100(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORAINGRESO200)) {
							existe=true;
							turnoAux.sethora_ingreso200(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORASALIDA200)) {
							existe=true;
							turnoAux.sethora_salida200(Time.valueOf(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTurno(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTurnoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTurno(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTurno=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTurno.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTurno.jComboBoxTiposAccionesFormularioTurno.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTurno) {				
					conSplash=true;//false;										
					
					//this.startProcessTurno(conSplash);
				
					this.generarReporteTurnosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTurno.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTurno.jComboBoxTiposAccionesFormularioTurno.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTurnosSeleccionados();
				//this.jComboBoxTiposAccionesTurno.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTurnosSeleccionados(false);
				//this.jComboBoxTiposAccionesTurno.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTurnosSeleccionados(true);
				//this.jComboBoxTiposAccionesTurno.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTurno();
				
				this.exportarTurnosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTurno.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTurno.jComboBoxTiposAccionesFormularioTurno.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTurnos();
				//this.importarTurnos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTurno.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTurno.jComboBoxTiposAccionesFormularioTurno.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTurno();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTurnosSeleccionados();
				//this.jComboBoxTiposAccionesTurno.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Turno", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTurno();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTurno)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTurno(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Turno",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTurno.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTurno.jComboBoxTiposAccionesFormularioTurno.setSelectedIndex(0);					
				}	
			} 			
			else if(TurnoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTurno) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTurno(conSplash);
					
						//this.actualizarParametrosGeneralTurno();
						
						this.generarReporteProcesoAccionTurnosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTurno.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTurno.jComboBoxTiposAccionesFormularioTurno.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TurnoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO TurnoS SELECCIONADOS?", "MANTENIMIENTO DE Turno", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTurno();
				
						this.actualizarParametrosGeneralTurno();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.turnoReturnGeneral=turnoLogic.procesarAccionTurnosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.turnoLogic.getTurnos(),this.turnoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTurnoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTurno.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTurno.jComboBoxTiposAccionesFormularioTurno.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTurno();
					
					TurnoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTurnoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTurno.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTurno.jComboBoxTiposAccionesFormularioTurno.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTurno(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTurnoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTurno();
			
			if(this.jInternalFrameDetalleFormTurno==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Turno> turnosSeleccionados=new ArrayList<Turno>();		
			Turno turno=new Turno();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTurno(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTurno.getSelectedItem();
			
			
			
			
			turnosSeleccionados=this.getTurnosSeleccionados(true);
			//this.sTipoAccion;
			
			if(turnosSeleccionados.size()==1) {
				for(Turno turnoAux:turnosSeleccionados) {
					turno=turnoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTurno();
			
      		//this.finishProcessTurno(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTurnoReturnGeneral() throws Exception {
		if(this.turnoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.turnoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.turnoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.turnoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.turnoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.turnoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTurno(false);
		}
		
		if(this.turnoReturnGeneral.getConRetornoLista() || this.turnoReturnGeneral.getConRetornoObjeto()) {
			if(this.turnoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.turnoLogic.setTurnos(this.turnoReturnGeneral.getTurnos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.turnoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.turnoLogic.setTurno(this.turnoReturnGeneral.getTurno());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTurno(false);
		}
	}
	
	public void actualizarParametrosGeneralTurno() throws Exception {
		
		
	}
	
	public ArrayList<Turno> getTurnosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Turno> turnosSeleccionados=new ArrayList<Turno>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTurno) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Turno turnoAux:turnoLogic.getTurnos()) {
					if(turnoAux.getIsSelected()) {
						turnosSeleccionados.add(turnoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Turno turnoAux:this.turnos) {
					if(turnoAux.getIsSelected()) {
						turnosSeleccionados.add(turnoAux);				
					}
				}
			}
			
			if(turnosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						turnosSeleccionados.addAll(this.turnoLogic.getTurnos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						turnosSeleccionados.addAll(this.turnos);				
					}
				}
			}
		} else {
			turnosSeleccionados.add(this.turno);
		}
		
		return turnosSeleccionados;
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
	
	public void generarReporteTurnosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTurnosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTurnosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTurnosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTurnosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Turno",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTurnosSeleccionados() throws Exception {
		ArrayList<Turno> turnosSeleccionados=new ArrayList<Turno>();		
		
		turnosSeleccionados=this.getTurnosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTurnos("Todos",turnosSeleccionados);
		
	}	
	
	public void generarReporteNormalTurnosSeleccionados() throws Exception {
		ArrayList<Turno> turnosSeleccionados=new ArrayList<Turno>();		
		
		turnosSeleccionados=this.getTurnosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTurnos("Todos",turnosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTurnosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Turno> turnosSeleccionados=new ArrayList<Turno>();
		
		turnosSeleccionados=this.getTurnosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTurnos("Todos",turnosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTurnosSeleccionados() throws Exception {
		ArrayList<Turno> turnosSeleccionados=new ArrayList<Turno>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTurno();
		
		
		turnosSeleccionados=this.getTurnosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTurno();
		
		
		//this.generarReporteTurnos("Todos",turnosSeleccionados ,turnoImplementable,turnoImplementableHome);
	}
	
	public void mostrarImportacionTurnos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTurno();
		
		this.abrirFrameImportacionTurno();		
		
			
		//this.generarReporteTurnos("Todos",turnosSeleccionados ,turnoImplementable,turnoImplementableHome);
	}
	
	public void importarTurnos() throws Exception {		
	
	}
	
	public void exportarTurnosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTurnosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTurnosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTurnosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Turno",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTurnosSeleccionados() throws Exception {
		ArrayList<Turno> turnosSeleccionados=new ArrayList<Turno>();		
		
		turnosSeleccionados=this.getTurnosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"turno."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTurno(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Turno turnoAux:turnosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTurno(turnoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//turnoAux.setsDetalleGeneralEntityReporte(turnoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.turnoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Turno",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTurno(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TurnoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TurnoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TurnoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TurnoConstantesFunciones.LABEL_HORAENTRADA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TurnoConstantesFunciones.LABEL_HORASALIDA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TurnoConstantesFunciones.LABEL_HORAINGRESORECESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TurnoConstantesFunciones.LABEL_HORASALIDARECESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TurnoConstantesFunciones.LABEL_HORADURANTERECESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TurnoConstantesFunciones.LABEL_HORAINGRESOALMUERZO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TurnoConstantesFunciones.LABEL_HORASALIDAALMUERZO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TurnoConstantesFunciones.LABEL_HORADURANTEALMUERZO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TurnoConstantesFunciones.LABEL_HORAINGRESO25;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TurnoConstantesFunciones.LABEL_HORASALIDA25;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TurnoConstantesFunciones.LABEL_HORAINGRESO50;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TurnoConstantesFunciones.LABEL_HORASALIDA50;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TurnoConstantesFunciones.LABEL_HORAINGRESO100;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TurnoConstantesFunciones.LABEL_HORASALIDA100;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TurnoConstantesFunciones.LABEL_HORAINGRESO200;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TurnoConstantesFunciones.LABEL_HORASALIDA200;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTurno(Turno turno,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=turno.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=turno.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=turno.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=turno.gethora_entrada().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=turno.gethora_salida().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=turno.gethora_ingreso_receso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=turno.gethora_salida_receso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=turno.gethora_durante_receso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=turno.gethora_ingreso_almuerzo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=turno.gethora_salida_almuerzo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=turno.gethora_durante_almuerzo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=turno.gethora_ingreso25().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=turno.gethora_salida25().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=turno.gethora_ingreso50().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=turno.gethora_salida50().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=turno.gethora_ingreso100().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=turno.gethora_salida100().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=turno.gethora_ingreso200().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=turno.gethora_salida200().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTurnosSeleccionados() throws Exception {
		ArrayList<Turno> turnosSeleccionados=new ArrayList<Turno>();		
		
		turnosSeleccionados=this.getTurnosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"turno.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Turnos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTurno(row);				
				iRow++;
			}				
			
			for(Turno turnoAux:turnosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTurno(turnoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.turnoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Turno",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTurnosSeleccionados() throws Exception {
		ArrayList<Turno> turnosSeleccionados=new ArrayList<Turno>();		
		
		turnosSeleccionados=this.getTurnosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"turno.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("turnos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("turno");
			//elementRoot.appendChild(element);
		
			for(Turno turnoAux:turnosSeleccionados) {
				element = document.createElement("turno");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTurno(turnoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.turnoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Turno",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTurno(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TurnoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TurnoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TurnoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TurnoConstantesFunciones.LABEL_HORAENTRADA);
		cell = row.createCell(iColumn++);cell.setCellValue(TurnoConstantesFunciones.LABEL_HORASALIDA);
		cell = row.createCell(iColumn++);cell.setCellValue(TurnoConstantesFunciones.LABEL_HORAINGRESORECESO);
		cell = row.createCell(iColumn++);cell.setCellValue(TurnoConstantesFunciones.LABEL_HORASALIDARECESO);
		cell = row.createCell(iColumn++);cell.setCellValue(TurnoConstantesFunciones.LABEL_HORADURANTERECESO);
		cell = row.createCell(iColumn++);cell.setCellValue(TurnoConstantesFunciones.LABEL_HORAINGRESOALMUERZO);
		cell = row.createCell(iColumn++);cell.setCellValue(TurnoConstantesFunciones.LABEL_HORASALIDAALMUERZO);
		cell = row.createCell(iColumn++);cell.setCellValue(TurnoConstantesFunciones.LABEL_HORADURANTEALMUERZO);
		cell = row.createCell(iColumn++);cell.setCellValue(TurnoConstantesFunciones.LABEL_HORAINGRESO25);
		cell = row.createCell(iColumn++);cell.setCellValue(TurnoConstantesFunciones.LABEL_HORASALIDA25);
		cell = row.createCell(iColumn++);cell.setCellValue(TurnoConstantesFunciones.LABEL_HORAINGRESO50);
		cell = row.createCell(iColumn++);cell.setCellValue(TurnoConstantesFunciones.LABEL_HORASALIDA50);
		cell = row.createCell(iColumn++);cell.setCellValue(TurnoConstantesFunciones.LABEL_HORAINGRESO100);
		cell = row.createCell(iColumn++);cell.setCellValue(TurnoConstantesFunciones.LABEL_HORASALIDA100);
		cell = row.createCell(iColumn++);cell.setCellValue(TurnoConstantesFunciones.LABEL_HORAINGRESO200);
		cell = row.createCell(iColumn++);cell.setCellValue(TurnoConstantesFunciones.LABEL_HORASALIDA200);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTurno(Turno turno,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(turno.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(turno.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(turno.gethora_entrada());
		cell = row.createCell(iColumn++);cell.setCellValue(turno.gethora_salida());
		cell = row.createCell(iColumn++);cell.setCellValue(turno.gethora_ingreso_receso());
		cell = row.createCell(iColumn++);cell.setCellValue(turno.gethora_salida_receso());
		cell = row.createCell(iColumn++);cell.setCellValue(turno.gethora_durante_receso());
		cell = row.createCell(iColumn++);cell.setCellValue(turno.gethora_ingreso_almuerzo());
		cell = row.createCell(iColumn++);cell.setCellValue(turno.gethora_salida_almuerzo());
		cell = row.createCell(iColumn++);cell.setCellValue(turno.gethora_durante_almuerzo());
		cell = row.createCell(iColumn++);cell.setCellValue(turno.gethora_ingreso25());
		cell = row.createCell(iColumn++);cell.setCellValue(turno.gethora_salida25());
		cell = row.createCell(iColumn++);cell.setCellValue(turno.gethora_ingreso50());
		cell = row.createCell(iColumn++);cell.setCellValue(turno.gethora_salida50());
		cell = row.createCell(iColumn++);cell.setCellValue(turno.gethora_ingreso100());
		cell = row.createCell(iColumn++);cell.setCellValue(turno.gethora_salida100());
		cell = row.createCell(iColumn++);cell.setCellValue(turno.gethora_ingreso200());
		cell = row.createCell(iColumn++);cell.setCellValue(turno.gethora_salida200());				
	}
	
	public void setFilaDatosExportarXmlTurno(Turno turno,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TurnoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(turno.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TurnoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(turno.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TurnoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(turno.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementhora_entrada = document.createElement(TurnoConstantesFunciones.HORAENTRADA);
		elementhora_entrada.appendChild(document.createTextNode(turno.gethora_entrada().toString().trim()));
		element.appendChild(elementhora_entrada);

		Element elementhora_salida = document.createElement(TurnoConstantesFunciones.HORASALIDA);
		elementhora_salida.appendChild(document.createTextNode(turno.gethora_salida().toString().trim()));
		element.appendChild(elementhora_salida);

		Element elementhora_ingreso_receso = document.createElement(TurnoConstantesFunciones.HORAINGRESORECESO);
		elementhora_ingreso_receso.appendChild(document.createTextNode(turno.gethora_ingreso_receso().toString().trim()));
		element.appendChild(elementhora_ingreso_receso);

		Element elementhora_salida_receso = document.createElement(TurnoConstantesFunciones.HORASALIDARECESO);
		elementhora_salida_receso.appendChild(document.createTextNode(turno.gethora_salida_receso().toString().trim()));
		element.appendChild(elementhora_salida_receso);

		Element elementhora_durante_receso = document.createElement(TurnoConstantesFunciones.HORADURANTERECESO);
		elementhora_durante_receso.appendChild(document.createTextNode(turno.gethora_durante_receso().toString().trim()));
		element.appendChild(elementhora_durante_receso);

		Element elementhora_ingreso_almuerzo = document.createElement(TurnoConstantesFunciones.HORAINGRESOALMUERZO);
		elementhora_ingreso_almuerzo.appendChild(document.createTextNode(turno.gethora_ingreso_almuerzo().toString().trim()));
		element.appendChild(elementhora_ingreso_almuerzo);

		Element elementhora_salida_almuerzo = document.createElement(TurnoConstantesFunciones.HORASALIDAALMUERZO);
		elementhora_salida_almuerzo.appendChild(document.createTextNode(turno.gethora_salida_almuerzo().toString().trim()));
		element.appendChild(elementhora_salida_almuerzo);

		Element elementhora_durante_almuerzo = document.createElement(TurnoConstantesFunciones.HORADURANTEALMUERZO);
		elementhora_durante_almuerzo.appendChild(document.createTextNode(turno.gethora_durante_almuerzo().toString().trim()));
		element.appendChild(elementhora_durante_almuerzo);

		Element elementhora_ingreso25 = document.createElement(TurnoConstantesFunciones.HORAINGRESO25);
		elementhora_ingreso25.appendChild(document.createTextNode(turno.gethora_ingreso25().toString().trim()));
		element.appendChild(elementhora_ingreso25);

		Element elementhora_salida25 = document.createElement(TurnoConstantesFunciones.HORASALIDA25);
		elementhora_salida25.appendChild(document.createTextNode(turno.gethora_salida25().toString().trim()));
		element.appendChild(elementhora_salida25);

		Element elementhora_ingreso50 = document.createElement(TurnoConstantesFunciones.HORAINGRESO50);
		elementhora_ingreso50.appendChild(document.createTextNode(turno.gethora_ingreso50().toString().trim()));
		element.appendChild(elementhora_ingreso50);

		Element elementhora_salida50 = document.createElement(TurnoConstantesFunciones.HORASALIDA50);
		elementhora_salida50.appendChild(document.createTextNode(turno.gethora_salida50().toString().trim()));
		element.appendChild(elementhora_salida50);

		Element elementhora_ingreso100 = document.createElement(TurnoConstantesFunciones.HORAINGRESO100);
		elementhora_ingreso100.appendChild(document.createTextNode(turno.gethora_ingreso100().toString().trim()));
		element.appendChild(elementhora_ingreso100);

		Element elementhora_salida100 = document.createElement(TurnoConstantesFunciones.HORASALIDA100);
		elementhora_salida100.appendChild(document.createTextNode(turno.gethora_salida100().toString().trim()));
		element.appendChild(elementhora_salida100);

		Element elementhora_ingreso200 = document.createElement(TurnoConstantesFunciones.HORAINGRESO200);
		elementhora_ingreso200.appendChild(document.createTextNode(turno.gethora_ingreso200().toString().trim()));
		element.appendChild(elementhora_ingreso200);

		Element elementhora_salida200 = document.createElement(TurnoConstantesFunciones.HORASALIDA200);
		elementhora_salida200.appendChild(document.createTextNode(turno.gethora_salida200().toString().trim()));
		element.appendChild(elementhora_salida200);
	}
	
	public void generarReporteGroupGenericoTurnosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Turno> turnosSeleccionados=new ArrayList<Turno>();
		
		turnosSeleccionados=this.getTurnosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTurno(turnosSeleccionados);
		
		this.generarReporteTurnos("Todos",turnosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTurno(ArrayList<Turno> turnosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Turno turnoAux:turnosSeleccionados) {
				turnoAux.setsDetalleGeneralEntityReporte(turnoAux.toString());
			
				if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					turnoAux.setsDescripcionGeneralEntityReporte1(turnoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORAENTRADA)) {
					existe=true;
					turnoAux.setsDescripcionGeneralEntityReporte1(turnoAux.gethora_entrada().toString());
				}
				 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORASALIDA)) {
					existe=true;
					turnoAux.setsDescripcionGeneralEntityReporte1(turnoAux.gethora_salida().toString());
				}
				 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORAINGRESORECESO)) {
					existe=true;
					turnoAux.setsDescripcionGeneralEntityReporte1(turnoAux.gethora_ingreso_receso().toString());
				}
				 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORASALIDARECESO)) {
					existe=true;
					turnoAux.setsDescripcionGeneralEntityReporte1(turnoAux.gethora_salida_receso().toString());
				}
				 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORADURANTERECESO)) {
					existe=true;
					turnoAux.setsDescripcionGeneralEntityReporte1(turnoAux.gethora_durante_receso().toString());
				}
				 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORAINGRESOALMUERZO)) {
					existe=true;
					turnoAux.setsDescripcionGeneralEntityReporte1(turnoAux.gethora_ingreso_almuerzo().toString());
				}
				 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORASALIDAALMUERZO)) {
					existe=true;
					turnoAux.setsDescripcionGeneralEntityReporte1(turnoAux.gethora_salida_almuerzo().toString());
				}
				 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORADURANTEALMUERZO)) {
					existe=true;
					turnoAux.setsDescripcionGeneralEntityReporte1(turnoAux.gethora_durante_almuerzo().toString());
				}
				 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORAINGRESO25)) {
					existe=true;
					turnoAux.setsDescripcionGeneralEntityReporte1(turnoAux.gethora_ingreso25().toString());
				}
				 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORASALIDA25)) {
					existe=true;
					turnoAux.setsDescripcionGeneralEntityReporte1(turnoAux.gethora_salida25().toString());
				}
				 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORAINGRESO50)) {
					existe=true;
					turnoAux.setsDescripcionGeneralEntityReporte1(turnoAux.gethora_ingreso50().toString());
				}
				 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORASALIDA50)) {
					existe=true;
					turnoAux.setsDescripcionGeneralEntityReporte1(turnoAux.gethora_salida50().toString());
				}
				 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORAINGRESO100)) {
					existe=true;
					turnoAux.setsDescripcionGeneralEntityReporte1(turnoAux.gethora_ingreso100().toString());
				}
				 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORASALIDA100)) {
					existe=true;
					turnoAux.setsDescripcionGeneralEntityReporte1(turnoAux.gethora_salida100().toString());
				}
				 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORAINGRESO200)) {
					existe=true;
					turnoAux.setsDescripcionGeneralEntityReporte1(turnoAux.gethora_ingreso200().toString());
				}
				 else if(sTipoSeleccionar.equals(TurnoConstantesFunciones.LABEL_HORASALIDA200)) {
					existe=true;
					turnoAux.setsDescripcionGeneralEntityReporte1(turnoAux.gethora_salida200().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TurnoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTurno(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTurno=true;
				this.isVisibilidadCeldaNuevoRelacionesTurno=true;
				this.isVisibilidadCeldaGuardarCambiosTurno=true;
			}
			
			this.isVisibilidadCeldaModificarTurno=false;
			this.isVisibilidadCeldaActualizarTurno=false;
			this.isVisibilidadCeldaEliminarTurno=false;
			this.isVisibilidadCeldaCancelarTurno=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTurno=true;
				} else {
					this.isVisibilidadCeldaGuardarTurno=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTurno=false;
			this.isVisibilidadCeldaNuevoRelacionesTurno=false;
			this.isVisibilidadCeldaGuardarCambiosTurno=false;
			this.isVisibilidadCeldaModificarTurno=false;
			this.isVisibilidadCeldaActualizarTurno=true;
			this.isVisibilidadCeldaEliminarTurno=false;
			this.isVisibilidadCeldaCancelarTurno=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTurno=true;
				} else {
					this.isVisibilidadCeldaGuardarTurno=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTurno=false;
			this.isVisibilidadCeldaNuevoRelacionesTurno=false;
			this.isVisibilidadCeldaGuardarCambiosTurno=false;
			this.isVisibilidadCeldaModificarTurno=false;
			this.isVisibilidadCeldaActualizarTurno=true;
			this.isVisibilidadCeldaEliminarTurno=true;
			this.isVisibilidadCeldaCancelarTurno=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTurno=true;
				} else {
					this.isVisibilidadCeldaGuardarTurno=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTurno=false;
			this.isVisibilidadCeldaNuevoRelacionesTurno=false;
			this.isVisibilidadCeldaGuardarCambiosTurno=false;
			this.isVisibilidadCeldaModificarTurno=false;
			this.isVisibilidadCeldaActualizarTurno=true;
			this.isVisibilidadCeldaEliminarTurno=false;
			this.isVisibilidadCeldaCancelarTurno=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTurno=false;
				} else {
					this.isVisibilidadCeldaGuardarTurno=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTurno=true;
			this.isVisibilidadCeldaNuevoRelacionesTurno=true;
			this.isVisibilidadCeldaGuardarCambiosTurno=true;
			this.isVisibilidadCeldaModificarTurno=false;
			this.isVisibilidadCeldaActualizarTurno=false;
			this.isVisibilidadCeldaEliminarTurno=false;
			this.isVisibilidadCeldaCancelarTurno=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTurno=true;
				} else {
					this.isVisibilidadCeldaGuardarTurno=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTurno=false;
			this.isVisibilidadCeldaNuevoRelacionesTurno=false;
			this.isVisibilidadCeldaGuardarCambiosTurno=false;
			this.isVisibilidadCeldaActualizarTurno=false;
			this.isVisibilidadCeldaEliminarTurno=false;
			this.isVisibilidadCeldaCancelarTurno=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTurno=false;
				} else {
					this.isVisibilidadCeldaGuardarTurno=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTurno=false;
			this.isVisibilidadCeldaNuevoRelacionesTurno=false;
			this.isVisibilidadCeldaGuardarCambiosTurno=false;
			this.isVisibilidadCeldaModificarTurno=true;
			this.isVisibilidadCeldaActualizarTurno=false;
			this.isVisibilidadCeldaEliminarTurno=false;
			this.isVisibilidadCeldaCancelarTurno=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTurno=false;
				} else {
					this.isVisibilidadCeldaGuardarTurno=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TurnoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTurno=true;
			this.isVisibilidadCeldaNuevoRelacionesTurno=true;
			this.isVisibilidadCeldaGuardarCambiosTurno=true;
		} else {
			this.actualizarEstadoPanelsTurno(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTurno=false;
			//this.isVisibilidadCeldaVerFormTurno=false;
			this.isVisibilidadCeldaDuplicarTurno=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!turnoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTurno=false;
		} else {
			this.isVisibilidadCeldaNuevoTurno=false;
			this.isVisibilidadCeldaGuardarCambiosTurno=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(turnoSessionBean.getEsGuardarRelacionado()) {
			if(!turnoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTurno=false;												
			}
			
			this.jButtonCerrarTurno.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTurno=false;
		}
		
		if(!this.permiteMantenimiento(this.turno)) {
			this.isVisibilidadCeldaActualizarTurno=false;
			this.isVisibilidadCeldaEliminarTurno=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTurno() {
	}
	
	public void actualizarEstadoPanelsTurno(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTurno!=null) {
				this.jScrollPanelDatosEdicionTurno.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTurno!=null) {
				this.jTabbedPaneBusquedasTurno.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTurno!=null) {
				this.jScrollPanelDatosTurno.setVisible(true);
			}
			
			if(this.jPanelPaginacionTurno!=null) {
				this.jPanelPaginacionTurno.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTurno!=null) {
				this.jPanelParametrosReportesTurno.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTurno!=null) {
				this.jScrollPanelDatosEdicionTurno.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTurno!=null) {
				this.jTabbedPaneBusquedasTurno.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTurno!=null) {
				this.jScrollPanelDatosTurno.setVisible(false);
			}
			
			if(this.jPanelPaginacionTurno!=null) {
				this.jPanelPaginacionTurno.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTurno!=null) {
				this.jPanelParametrosReportesTurno.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTurno!=null) {
				this.jScrollPanelDatosEdicionTurno.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTurno!=null) {
				this.jTabbedPaneBusquedasTurno.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTurno!=null) {
				this.jScrollPanelDatosTurno.setVisible(false);
			}
			
			if(this.jPanelPaginacionTurno!=null) {
				this.jPanelPaginacionTurno.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTurno!=null) {
				this.jPanelParametrosReportesTurno.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTurno!=null) {
				this.jScrollPanelDatosEdicionTurno.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTurno!=null) {
				this.jTabbedPaneBusquedasTurno.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTurno!=null) {
				this.jScrollPanelDatosTurno.setVisible(false);
			}
			
			if(this.jPanelPaginacionTurno!=null) {
				this.jPanelPaginacionTurno.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTurno!=null) {
				this.jPanelParametrosReportesTurno.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTurno!=null) {
				this.jScrollPanelDatosEdicionTurno.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTurno!=null) {
				this.jTabbedPaneBusquedasTurno.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTurno!=null) {
				this.jScrollPanelDatosTurno.setVisible(true);
			}
			
			if(this.jPanelPaginacionTurno!=null) {
				this.jPanelPaginacionTurno.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTurno!=null) {
				this.jPanelParametrosReportesTurno.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTurno!=null) {
				this.jScrollPanelDatosEdicionTurno.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTurno!=null) {
				this.jTabbedPaneBusquedasTurno.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTurno!=null) {
				this.jScrollPanelDatosTurno.setVisible(true);
			}
			
			if(this.jPanelPaginacionTurno!=null) {
				this.jPanelPaginacionTurno.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTurno!=null) {
				this.jPanelParametrosReportesTurno.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTurno!=null) {
				this.jScrollPanelDatosEdicionTurno.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTurno!=null) {
				this.jTabbedPaneBusquedasTurno.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTurno!=null) {
				this.jScrollPanelDatosTurno.setVisible(true);
			}
			
			if(this.jPanelPaginacionTurno!=null) {
				this.jPanelPaginacionTurno.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTurno!=null) {
				this.jPanelParametrosReportesTurno.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.turnoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTurno!=null) {
					this.jTabbedPaneBusquedasTurno.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTurno!=null) {
				this.jPanelParametrosReportesTurno.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.turnoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTurno!=null) {
				this.jTabbedPaneBusquedasTurno.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTurno!=null) {
				this.jPanelParametrosReportesTurno.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TurnoSessionBean turnoSessionBean=new TurnoSessionBean();
		
		if(this.turnoSessionBean==null) {
			this.turnoSessionBean=new TurnoSessionBean();
		}
		
		this.turnoSessionBean.setsUltimaBusquedaTurno(this.getsAccionBusqueda());
		this.turnoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.turnoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			turnoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TurnoSessionBean turnoSessionBean=new TurnoSessionBean();
		
		if(this.turnoSessionBean==null) {
			this.turnoSessionBean=new TurnoSessionBean();
		}
		
		if(this.turnoSessionBean.getsUltimaBusquedaTurno()!=null&&!this.turnoSessionBean.getsUltimaBusquedaTurno().equals("")) {
			this.setsAccionBusqueda(turnoSessionBean.getsUltimaBusquedaTurno());
			this.setiNumeroPaginacion(turnoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(turnoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(turnoSessionBean.getid_empresa());
				turnoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.turnoSessionBean.setsUltimaBusquedaTurno("");
		this.turnoSessionBean.setiNumeroPaginacion(TurnoConstantesFunciones.INUMEROPAGINACION);
		this.turnoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTurno(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTurno() {
		this.updateBorderResaltarBusquedasFormularioTurno();
		this.updateVisibilidadBusquedasFormularioTurno();
		this.updateHabilitarBusquedasFormularioTurno();
	}
	
	public void updateBorderResaltarBusquedasFormularioTurno() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTurno.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTurno() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTurno.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTurno() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTurno.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTurno(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTurno.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTurno() throws Exception {

		if(this.jInternalFrameDetalleFormTurno==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTurno();
		this.updateVisibilidadResaltarControlesFormularioTurno();
		this.updateHabilitarResaltarControlesFormularioTurno();
		
	}
	
	public void updateBorderResaltarControlesFormularioTurno() throws Exception {
		if(this.jInternalFrameDetalleFormTurno==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.turnoConstantesFunciones.resaltaridTurno!=null && this.jInternalFrameDetalleFormTurno!=null) {this.jInternalFrameDetalleFormTurno.jLabelidTurno.setBorder(this.turnoConstantesFunciones.resaltaridTurno);}
		if(this.turnoConstantesFunciones.resaltarid_empresaTurno!=null && this.jInternalFrameDetalleFormTurno!=null) {this.jInternalFrameDetalleFormTurno.jComboBoxid_empresaTurno.setBorder(this.turnoConstantesFunciones.resaltarid_empresaTurno);}
		if(this.turnoConstantesFunciones.resaltarhora_entradaTurno!=null && this.jInternalFrameDetalleFormTurno!=null) {this.jInternalFrameDetalleFormTurno.jSpinnerhora_entradaTurno.setBorder(this.turnoConstantesFunciones.resaltarhora_entradaTurno);}
		if(this.turnoConstantesFunciones.resaltarhora_salidaTurno!=null && this.jInternalFrameDetalleFormTurno!=null) {this.jInternalFrameDetalleFormTurno.jSpinnerhora_salidaTurno.setBorder(this.turnoConstantesFunciones.resaltarhora_salidaTurno);}
		if(this.turnoConstantesFunciones.resaltarhora_ingreso_recesoTurno!=null && this.jInternalFrameDetalleFormTurno!=null) {this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso_recesoTurno.setBorder(this.turnoConstantesFunciones.resaltarhora_ingreso_recesoTurno);}
		if(this.turnoConstantesFunciones.resaltarhora_salida_recesoTurno!=null && this.jInternalFrameDetalleFormTurno!=null) {this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida_recesoTurno.setBorder(this.turnoConstantesFunciones.resaltarhora_salida_recesoTurno);}
		if(this.turnoConstantesFunciones.resaltarhora_durante_recesoTurno!=null && this.jInternalFrameDetalleFormTurno!=null) {this.jInternalFrameDetalleFormTurno.jSpinnerhora_durante_recesoTurno.setBorder(this.turnoConstantesFunciones.resaltarhora_durante_recesoTurno);}
		if(this.turnoConstantesFunciones.resaltarhora_ingreso_almuerzoTurno!=null && this.jInternalFrameDetalleFormTurno!=null) {this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso_almuerzoTurno.setBorder(this.turnoConstantesFunciones.resaltarhora_ingreso_almuerzoTurno);}
		if(this.turnoConstantesFunciones.resaltarhora_salida_almuerzoTurno!=null && this.jInternalFrameDetalleFormTurno!=null) {this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida_almuerzoTurno.setBorder(this.turnoConstantesFunciones.resaltarhora_salida_almuerzoTurno);}
		if(this.turnoConstantesFunciones.resaltarhora_durante_almuerzoTurno!=null && this.jInternalFrameDetalleFormTurno!=null) {this.jInternalFrameDetalleFormTurno.jSpinnerhora_durante_almuerzoTurno.setBorder(this.turnoConstantesFunciones.resaltarhora_durante_almuerzoTurno);}
		if(this.turnoConstantesFunciones.resaltarhora_ingreso25Turno!=null && this.jInternalFrameDetalleFormTurno!=null) {this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso25Turno.setBorder(this.turnoConstantesFunciones.resaltarhora_ingreso25Turno);}
		if(this.turnoConstantesFunciones.resaltarhora_salida25Turno!=null && this.jInternalFrameDetalleFormTurno!=null) {this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida25Turno.setBorder(this.turnoConstantesFunciones.resaltarhora_salida25Turno);}
		if(this.turnoConstantesFunciones.resaltarhora_ingreso50Turno!=null && this.jInternalFrameDetalleFormTurno!=null) {this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso50Turno.setBorder(this.turnoConstantesFunciones.resaltarhora_ingreso50Turno);}
		if(this.turnoConstantesFunciones.resaltarhora_salida50Turno!=null && this.jInternalFrameDetalleFormTurno!=null) {this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida50Turno.setBorder(this.turnoConstantesFunciones.resaltarhora_salida50Turno);}
		if(this.turnoConstantesFunciones.resaltarhora_ingreso100Turno!=null && this.jInternalFrameDetalleFormTurno!=null) {this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso100Turno.setBorder(this.turnoConstantesFunciones.resaltarhora_ingreso100Turno);}
		if(this.turnoConstantesFunciones.resaltarhora_salida100Turno!=null && this.jInternalFrameDetalleFormTurno!=null) {this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida100Turno.setBorder(this.turnoConstantesFunciones.resaltarhora_salida100Turno);}
		if(this.turnoConstantesFunciones.resaltarhora_ingreso200Turno!=null && this.jInternalFrameDetalleFormTurno!=null) {this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso200Turno.setBorder(this.turnoConstantesFunciones.resaltarhora_ingreso200Turno);}
		if(this.turnoConstantesFunciones.resaltarhora_salida200Turno!=null && this.jInternalFrameDetalleFormTurno!=null) {this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida200Turno.setBorder(this.turnoConstantesFunciones.resaltarhora_salida200Turno);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTurno() throws Exception {		
		if(this.jInternalFrameDetalleFormTurno==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTurno!=null) {
	
		//this.jInternalFrameDetalleFormTurno.jLabelidTurno.setVisible(this.turnoConstantesFunciones.mostraridTurno);
		this.jInternalFrameDetalleFormTurno.jPanelidTurno.setVisible(this.turnoConstantesFunciones.mostraridTurno);
		//this.jInternalFrameDetalleFormTurno.jComboBoxid_empresaTurno.setVisible(this.turnoConstantesFunciones.mostrarid_empresaTurno);
		this.jInternalFrameDetalleFormTurno.jPanelid_empresaTurno.setVisible(this.turnoConstantesFunciones.mostrarid_empresaTurno);
		//this.jInternalFrameDetalleFormTurno.jSpinnerhora_entradaTurno.setVisible(this.turnoConstantesFunciones.mostrarhora_entradaTurno);
		this.jInternalFrameDetalleFormTurno.jPanelhora_entradaTurno.setVisible(this.turnoConstantesFunciones.mostrarhora_entradaTurno);
		//this.jInternalFrameDetalleFormTurno.jSpinnerhora_salidaTurno.setVisible(this.turnoConstantesFunciones.mostrarhora_salidaTurno);
		this.jInternalFrameDetalleFormTurno.jPanelhora_salidaTurno.setVisible(this.turnoConstantesFunciones.mostrarhora_salidaTurno);
		//this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso_recesoTurno.setVisible(this.turnoConstantesFunciones.mostrarhora_ingreso_recesoTurno);
		this.jInternalFrameDetalleFormTurno.jPanelhora_ingreso_recesoTurno.setVisible(this.turnoConstantesFunciones.mostrarhora_ingreso_recesoTurno);
		//this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida_recesoTurno.setVisible(this.turnoConstantesFunciones.mostrarhora_salida_recesoTurno);
		this.jInternalFrameDetalleFormTurno.jPanelhora_salida_recesoTurno.setVisible(this.turnoConstantesFunciones.mostrarhora_salida_recesoTurno);
		//this.jInternalFrameDetalleFormTurno.jSpinnerhora_durante_recesoTurno.setVisible(this.turnoConstantesFunciones.mostrarhora_durante_recesoTurno);
		this.jInternalFrameDetalleFormTurno.jPanelhora_durante_recesoTurno.setVisible(this.turnoConstantesFunciones.mostrarhora_durante_recesoTurno);
		//this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso_almuerzoTurno.setVisible(this.turnoConstantesFunciones.mostrarhora_ingreso_almuerzoTurno);
		this.jInternalFrameDetalleFormTurno.jPanelhora_ingreso_almuerzoTurno.setVisible(this.turnoConstantesFunciones.mostrarhora_ingreso_almuerzoTurno);
		//this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida_almuerzoTurno.setVisible(this.turnoConstantesFunciones.mostrarhora_salida_almuerzoTurno);
		this.jInternalFrameDetalleFormTurno.jPanelhora_salida_almuerzoTurno.setVisible(this.turnoConstantesFunciones.mostrarhora_salida_almuerzoTurno);
		//this.jInternalFrameDetalleFormTurno.jSpinnerhora_durante_almuerzoTurno.setVisible(this.turnoConstantesFunciones.mostrarhora_durante_almuerzoTurno);
		this.jInternalFrameDetalleFormTurno.jPanelhora_durante_almuerzoTurno.setVisible(this.turnoConstantesFunciones.mostrarhora_durante_almuerzoTurno);
		//this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso25Turno.setVisible(this.turnoConstantesFunciones.mostrarhora_ingreso25Turno);
		this.jInternalFrameDetalleFormTurno.jPanelhora_ingreso25Turno.setVisible(this.turnoConstantesFunciones.mostrarhora_ingreso25Turno);
		//this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida25Turno.setVisible(this.turnoConstantesFunciones.mostrarhora_salida25Turno);
		this.jInternalFrameDetalleFormTurno.jPanelhora_salida25Turno.setVisible(this.turnoConstantesFunciones.mostrarhora_salida25Turno);
		//this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso50Turno.setVisible(this.turnoConstantesFunciones.mostrarhora_ingreso50Turno);
		this.jInternalFrameDetalleFormTurno.jPanelhora_ingreso50Turno.setVisible(this.turnoConstantesFunciones.mostrarhora_ingreso50Turno);
		//this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida50Turno.setVisible(this.turnoConstantesFunciones.mostrarhora_salida50Turno);
		this.jInternalFrameDetalleFormTurno.jPanelhora_salida50Turno.setVisible(this.turnoConstantesFunciones.mostrarhora_salida50Turno);
		//this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso100Turno.setVisible(this.turnoConstantesFunciones.mostrarhora_ingreso100Turno);
		this.jInternalFrameDetalleFormTurno.jPanelhora_ingreso100Turno.setVisible(this.turnoConstantesFunciones.mostrarhora_ingreso100Turno);
		//this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida100Turno.setVisible(this.turnoConstantesFunciones.mostrarhora_salida100Turno);
		this.jInternalFrameDetalleFormTurno.jPanelhora_salida100Turno.setVisible(this.turnoConstantesFunciones.mostrarhora_salida100Turno);
		//this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso200Turno.setVisible(this.turnoConstantesFunciones.mostrarhora_ingreso200Turno);
		this.jInternalFrameDetalleFormTurno.jPanelhora_ingreso200Turno.setVisible(this.turnoConstantesFunciones.mostrarhora_ingreso200Turno);
		//this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida200Turno.setVisible(this.turnoConstantesFunciones.mostrarhora_salida200Turno);
		this.jInternalFrameDetalleFormTurno.jPanelhora_salida200Turno.setVisible(this.turnoConstantesFunciones.mostrarhora_salida200Turno);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTurno() throws Exception {
		if(this.jInternalFrameDetalleFormTurno==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTurno!=null) {
	
		this.jInternalFrameDetalleFormTurno.jLabelidTurno.setEnabled(this.turnoConstantesFunciones.activaridTurno);
		this.jInternalFrameDetalleFormTurno.jComboBoxid_empresaTurno.setEnabled(this.turnoConstantesFunciones.activarid_empresaTurno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_entradaTurno.setEnabled(this.turnoConstantesFunciones.activarhora_entradaTurno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_salidaTurno.setEnabled(this.turnoConstantesFunciones.activarhora_salidaTurno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso_recesoTurno.setEnabled(this.turnoConstantesFunciones.activarhora_ingreso_recesoTurno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida_recesoTurno.setEnabled(this.turnoConstantesFunciones.activarhora_salida_recesoTurno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_durante_recesoTurno.setEnabled(this.turnoConstantesFunciones.activarhora_durante_recesoTurno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso_almuerzoTurno.setEnabled(this.turnoConstantesFunciones.activarhora_ingreso_almuerzoTurno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida_almuerzoTurno.setEnabled(this.turnoConstantesFunciones.activarhora_salida_almuerzoTurno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_durante_almuerzoTurno.setEnabled(this.turnoConstantesFunciones.activarhora_durante_almuerzoTurno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso25Turno.setEnabled(this.turnoConstantesFunciones.activarhora_ingreso25Turno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida25Turno.setEnabled(this.turnoConstantesFunciones.activarhora_salida25Turno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso50Turno.setEnabled(this.turnoConstantesFunciones.activarhora_ingreso50Turno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida50Turno.setEnabled(this.turnoConstantesFunciones.activarhora_salida50Turno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso100Turno.setEnabled(this.turnoConstantesFunciones.activarhora_ingreso100Turno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida100Turno.setEnabled(this.turnoConstantesFunciones.activarhora_salida100Turno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_ingreso200Turno.setEnabled(this.turnoConstantesFunciones.activarhora_ingreso200Turno);
		this.jInternalFrameDetalleFormTurno.jSpinnerhora_salida200Turno.setEnabled(this.turnoConstantesFunciones.activarhora_salida200Turno);
		}
	}
	
		
}